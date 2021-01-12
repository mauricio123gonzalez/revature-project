package com.blue_bank.service;



import java.util.List;

import com.blue_bank.exception.BusinessException;
import com.blue_bank.model.Users;

public interface UsersSearchService {
	
	public Users getUserByID(int uid) throws BusinessException;

	public List<Users> getAllUsers() throws BusinessException;

}
