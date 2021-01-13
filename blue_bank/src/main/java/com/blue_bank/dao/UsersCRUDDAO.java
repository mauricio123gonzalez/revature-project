package com.blue_bank.dao;

import java.util.List;

import com.blue_bank.exception.BusinessException;
import com.blue_bank.model.Users;

public interface UsersCRUDDAO {
	
	public int createUser(Users users) throws BusinessException; // create account
	
	public Users getUserByID(int uid) throws BusinessException; 
	
	public Users getUserByUserName(String username) throws BusinessException; //view account
	
	public Users depositAmount(double balance) throws BusinessException;
	//public Users get
	public Users withdrawAmount(double balance) throws BusinessException;

	public List<Users> getAllUsers() throws BusinessException;
	
}
