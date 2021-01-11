package com.blue_bank.model;

public class Users {
	
	private int uid;
	private String username;
	private String password;
	private int accountstatus;
	private double balance;
	
	public Users() {
		
	}
	
	public Users(int uid, String username, String password, int accountstatus, double balance) {
		
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.accountstatus = accountstatus;
		this.balance = balance;
	}
	
	public int getUid() {
		return uid;
	}
	
	public void setUid() {
		this.uid=uid;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername() {
		this.username=username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword() {
		this.password=password;
	}
	
	public int getAccountStatus() {
		return accountstatus;
	}
	
	public void setAccountStatus() {
		this.uid=uid;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance() {
		this.balance=balance;
	}
	
//	@Override
//	public String toString() {
//		return "
}
