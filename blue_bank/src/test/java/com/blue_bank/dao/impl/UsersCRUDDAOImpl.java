package com.blue_bank.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.blue_bank.dao.UsersCRUDDAO;
import com.blue_bank.dao.dbutil.PostgresqlConnection;
import com.blue_bank.exception.BusinessException;
import com.blue_bank.main.BlueBankMain;
import com.blue_bank.model.Users;

import jdk.internal.org.jline.utils.Log;

public class UsersCRUDDAOImpl implements UsersCRUDDAO{
	
	public static Logger log = Logger.getLogger(BlueBankMain.class);

	@Override
	public int createUser(Users users) throws BusinessException {
		int c = 0;
		try (Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "INSERT INTO bluebank.users(uid, username, password, accountstatus, balance, type) "
					+ "VALUES(?, ?, ?, ?, ?, ?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, users.getUid());
			preparedStatement.setString(2, users.getUsername());
			preparedStatement.setString(3, users.getPassword());
			preparedStatement.setInt(4, users.getAccountStatus());
			preparedStatement.setDouble(5, users.getBalance());
			preparedStatement.setString(6, users.getType());

			
			
			c = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new BusinessException("error at create");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return c;
	}

	@Override
	public Users getUserByID(int uid) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUserByUserName(String username) throws BusinessException {
		// TODO Auto-generated method stub
		Users users = null;
		
		try (Connection connection = PostgresqlConnection.getConnection()) {

			String sql = "SELECT * FROM bluebank.users WHERE username = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				users = new Users();
				users.setUid(resultSet.getInt("uid"));
				users.setUsername(username);
				users.setPassword(resultSet.getString("password"));
				users.setAccountStatus(resultSet.getInt("accountstatus"));
				users.setBalance(resultSet.getDouble("balance"));
				users.setType(resultSet.getString("type"));
				
				
			} else {
				throw new BusinessException("No customer with that username");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;

	}

	@Override
	public List<Users> getAllUsers() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users depositAmount(String username, double balance, double amount) throws BusinessException {
		Users users=null;
		try (Connection connection = PostgresqlConnection.getConnection()) {

			String sql = "SELECT * FROM bluebank.users WHERE username = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				users = new Users();
				users.setUid(resultSet.getInt("uid"));
				users.setUsername(username);
				users.setPassword(resultSet.getString("password"));
				users.setAccountStatus(resultSet.getInt("accountstatus"));
				users.setBalance(resultSet.getDouble("balance"));
				users.setType(resultSet.getString("type"));
				
				
			} else {
				throw new BusinessException("No customer with that username");
			}

			Double userBalance=users.getBalance();
			userBalance=(userBalance+amount);
			sql = "UPDATE bluebank.users " + "SET balance = ? WHERE username = ?";
			PreparedStatement preparedStatementtwo = connection.prepareStatement(sql);
			preparedStatementtwo.setString(2, username);
			preparedStatementtwo.setDouble(1, userBalance);
			preparedStatementtwo.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;

	}
		

	

	@Override
	public Users withdrawAmount(String username, double balance, double amount) throws BusinessException {
		// TODO Auto-generated method stub
		Users users=null;
		try (Connection connection = PostgresqlConnection.getConnection()) {

			String sql = "SELECT * FROM bluebank.users WHERE username = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				users = new Users();
				users.setUid(resultSet.getInt("uid"));
				users.setUsername(username);
				users.setPassword(resultSet.getString("password"));
				users.setAccountStatus(resultSet.getInt("accountstatus"));
				users.setBalance(resultSet.getDouble("balance"));
				users.setType(resultSet.getString("type"));
				
				
			} else {
				throw new BusinessException("No customer with that username");
			}

			Double userBalance=users.getBalance();
			userBalance=(userBalance-amount);
			if(userBalance>0) {
				
				sql = "UPDATE bluebank.users " + "SET balance = ? WHERE username = ?";
				PreparedStatement preparedStatementtwo = connection.prepareStatement(sql);
				preparedStatementtwo.setString(2, username);
				preparedStatementtwo.setDouble(1, userBalance);
				preparedStatementtwo.executeUpdate();
			}else{
				log.info("cannot create negative balance");
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;

	}

	@Override
	public Users approveAccount(int account) {
		// TODO Auto-generated method stub
		return null;
	}


}
	



