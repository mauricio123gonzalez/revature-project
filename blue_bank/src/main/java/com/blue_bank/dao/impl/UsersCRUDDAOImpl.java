package com.blue_bank.dao.impl;

import java.util.List;

import com.blue_bank.dao.UsersCRUDDAO;
import com.blue_bank.exception.BusinessException;
import com.blue_bank.model.Users;

public class UsersCRUDDAOImpl implements UsersCRUDDAO{

	@Override
	public int createUser(Users users) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Users getUserByID(int uid) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUserByUserName(String username) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users depositAmount(double balance) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users withdrawAmount(double balance) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> getAllUsers() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}


}
	



