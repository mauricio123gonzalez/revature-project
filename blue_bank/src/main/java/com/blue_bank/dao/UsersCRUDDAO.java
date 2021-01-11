package com.blue_bank.dao;

import com.blue_bank.exception.BusinessException;
import com.blue_bank.model.Users;

public interface UsersCRUDDAO {
	
	public int createUser(Users user) throws BusinessException;
	public int deleteUser(Users user) throws BusinessException;

}
