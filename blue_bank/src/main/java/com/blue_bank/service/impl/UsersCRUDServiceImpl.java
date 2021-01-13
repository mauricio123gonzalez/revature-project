package com.blue_bank.service.impl;

import java.util.List;

import com.blue_bank.dao.UsersCRUDDAO;
import com.blue_bank.dao.impl.UsersCRUDDAOImpl;
import com.blue_bank.exception.BusinessException;
import com.blue_bank.model.Users;
import com.blue_bank.service.UsersCRUDService;

public class UsersCRUDServiceImpl implements UsersCRUDService{

	private UsersCRUDDAO usersCRUDDAO=new UsersCRUDDAOImpl();

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
	public Users depositAmount(double balance, double amount) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users withdrawAmount(double balance, double amount) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users approveAccount(int account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> getAllUsers() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	


	
	

}
