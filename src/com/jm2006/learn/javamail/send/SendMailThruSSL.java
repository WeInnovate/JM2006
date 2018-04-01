package com.jm2006.learn.javamail.send;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailThruSSL {

	public static void main(String[] args) {

		String fromAddr = "karaninfo2018@gmail.com";
		String toAddr = "sahaikaran304@gmail.com,akashonline55@gmail.com,karthik.rao95@gmail.com,souptikghosh38@gmail.com,sangeethsudhakar94@gmail.com,amulyajazz@gmail.com";
		String ccAddr = "atul.wnw@gmail.com";
		String bccAddr = "karaninfo2018@gmail.com";
		String userName = "karaninfo2018@gmail.com";
		String password = "Sahai@#123";
		String subject = "JM2006 Test Mail - SSL";
		String text = "This is test mail. \n You can delete it.";

		Properties prop = new Properties();
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "465");
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.put("mail.smtp.socketFactory.port", "465");

		Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromAddr));
			message.setRecipients(RecipientType.TO, InternetAddress.parse(toAddr));
			message.setRecipients(RecipientType.CC, InternetAddress.parse(ccAddr));
			message.setRecipients(RecipientType.BCC, InternetAddress.parse(bccAddr));
			message.setSubject(subject);
			message.setText(text);

			Transport.send(message);
			System.out.println("Sent!");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

}
