package com.CurrDesign.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.CurrDesign.core.ConnDB;
import com.CurrDesign.dao.AccountDAO;
import com.CurrDesign.model.Account;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public Account findAccountByID(String userID) throws Exception {
		String sql = "select * from Account where userID="+ userID;
		ConnDB connDB = null;
		Account account = null;
		try {
			connDB = new ConnDB();
			ResultSet rs = connDB.executeQuery(sql);
			while(rs.next())
			{
				account = new Account();
				account.setID(rs.getString("userID"));
				account.setUsername(rs.getString("userName"));
				account.setPassword(rs.getString("password"));
				account.setRealName(rs.getString("realName"));
				account.setNetInDate(rs.getDate("neiInDate"));
				account.setBirthday(rs.getDate("birth"));
				account.setPhoneNum(rs.getString("telephone"));
				account.setAddress(rs.getString("address"));
				account.setLevel(rs.getInt("level"));
				account.setCurrentIntegral(rs.getInt("currentIntegral"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			connDB.close();
		}
		return account;
	}

	@Override
	public Account findAccountByName(String Username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAccount(Account account) throws Exception {
		// TODO Auto-generated method stub

	}

}
