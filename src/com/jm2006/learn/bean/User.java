package com.jm2006.learn.bean;

public class User {

	private String un;
	private String email;
	private String mob;
	private String gender;
	private String type;

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [un=" + un + ", email=" + email + ", mob=" + mob + ", gender=" + gender + ", type=" + type + "]";
	}
}
