package com.blue_bank.service;

import java.util.List;

import com.blue_bank.exception.BusinessException;
import com.blue_bank.model.Users;

public interface UsersCRUDService {
	
	public int createUser(Users users) throws BusinessException; // create account
	
	public Users getUserByID(int uid) throws BusinessException; 
	
	public Users getUserByUserName(String username) throws BusinessException; //view account
	
	public Users depositAmount(double balance, double amount) throws BusinessException;
	
	public Users withdrawAmount(double balance, double amount) throws BusinessException;
	
	public Users approveAccount(int account);

	public List<Users> getAllUsers() throws BusinessException;
	
	
	
	/*
	 * log.info("Hello customer "
	 * +userNameEntered+",what would you like to do today?");
	 * log.info("1: View account"); log.info("2: Create account");
	 * log.info("3: Withdraw from account"); log.info("4: Deposit into account");
	 * log.info("5: Transfer money to another account");
	 * log.info("6: Accept pending money transfers"); log.info("Hello employee "
	 * +userNameEntered+", what would you like to do today?");
	 * log.info("1: Approve or reject pending accounts");
	 * log.info("2: View customer account"); log.info("3: View all transactions");
	 */
	

}
