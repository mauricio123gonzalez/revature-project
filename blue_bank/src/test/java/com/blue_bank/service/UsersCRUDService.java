package com.blue_bank.service;

import java.util.List;

import com.blue_bank.exception.BusinessException;
import com.blue_bank.model.Users;

public interface UsersCRUDService {
	
	public int createUser(Users users) throws BusinessException; // create account
	
	public Users getUserByID(int uid) throws BusinessException; 
	
	public Users getUserByUserName(String username) throws BusinessException; //view account
	
	public Users depositAmount(String username, double balance, double amount) throws BusinessException;
	
	public Users withdrawAmount(String username, double balance, double amount) throws BusinessException;
	
	public Users approveAccount(int account);

	public List<Users> getAllUsers() throws BusinessException;
	
	

}
