package com.jm2006.learn.jdbc.tcl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;

import com.jm2006.learn.jdbc.util.DbUtil;

public class TransferAmount {

	static Connection con = null;
	static Savepoint s1 = null;

	public static void main(String[] args) {

		try {
			con = DbUtil.getConFromPropertyFile();
			con.setAutoCommit(false);

			PreparedStatement pstmtSalary = con
					.prepareStatement("UPDATE ACCOUNT_SUMMARY SET BALANCE = BALANCE + ? WHERE CUST_NAME = ?");
			PreparedStatement pstmtDebit = con
					.prepareStatement("UPDATE ACCOUNT_SUMMARY SET BALANCE = BALANCE - ? WHERE CUST_NAME = ?");
			PreparedStatement pstmtCredit = con
					.prepareStatement("UPDATE ACCOUNT_SUMMARY SET BALANCE = BALANCE + ? WHERE CUST_NAME = ?");

			Scanner scan = new Scanner(System.in);
			System.out.print("Please enter your salaried emp name: ");
			String salariedEmp = scan.nextLine();

			System.out.print("Enter the salary amount to be transfered: ");
			double salaryAmount = Double.parseDouble(scan.nextLine());

			System.out.print("Please enter your payee: ");
			String payee = scan.nextLine();

			System.out.print("Please enter your friend's name: ");
			String beneficiery = scan.nextLine();

			System.out.print("Enter the amount to be transfered: ");
			double amount = Double.parseDouble(scan.nextLine());

			pstmtSalary.setDouble(1, salaryAmount);
			pstmtSalary.setString(2, salariedEmp);
			int salaryCredit = pstmtSalary.executeUpdate();
			if (salaryCredit == 1)
				System.out.println("Salary credited.");

			s1 = con.setSavepoint("S1");

			pstmtDebit.setDouble(1, amount);
			pstmtDebit.setString(2, payee);
			int isDebited = pstmtDebit.executeUpdate();
			if (isDebited == 1)
				System.out.println("Debit successful.");

			pstmtCredit.setDouble(2, amount);
			pstmtCredit.setString(1, beneficiery);
			int isCredited = pstmtCredit.executeUpdate();
			if (isCredited == 1)
				System.out.println("Credit successful.");

			if (isDebited == 1 && isCredited == 1) {
				System.out.println("Commiting the transaction....");
				con.commit();
			}

		} catch (SQLException e) {
			try {
				con.rollback(s1);
				con.commit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			e.printStackTrace();
		}

	}

}
