package com.blue_bank.service;

import java.util.List;

import com.blue_bank.exception.BusinessException;
import com.blue_bank.model.Transactions;

public interface TransactionsCRUDService {
	
	public Transactions getTransactionsByUid(int uid) throws BusinessException;
	
	public Transactions getTransactionsByUsername(String username) throws BusinessException;
	
	public List<Transactions> getAllTransactions() throws BusinessException;
	
	
	

}
