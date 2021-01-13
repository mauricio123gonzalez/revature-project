package com.blue_bank.model;

public class Transactions {
	
	private int tid;
	private int uid;
	private String transaction;
	
	public Transactions() {
		
	}
	
	Transactions(int tid, int uid, String transaction) {
		
		super();
		this.tid = tid;
		this.uid = uid;
		this.transaction = transaction;
		
	}
	
	public int getTid() {
		return tid;
	}
	
	public void setTid() {
		this.tid=tid;
	}
	
	public int getUid() {
		return uid;
	}
	
	public void setUid() {
		this.uid=uid;
	}
	
	public String getTransaction() {
		return transaction;
	}
	
	public void setTransaction() {
		this.transaction=transaction;
	}
	
	@Override
	public String toString() {
		return "Transaction [tid = "+tid+"uid = "+uid+", transaction = "+transaction+"]";

}}
