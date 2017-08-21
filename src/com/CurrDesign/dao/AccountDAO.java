package com.CurrDesign.dao;

import com.CurrDesign.model.Account;

public interface AccountDAO {

	/*
	 * 根据ID查询信息
	 * 参数 ： 账户ID
	 * 返回 ： 账户对象
	 */
	public Account findAccountByID(String AccountID) throws Exception;
	
	/*
	 * 根据账户名查询信息
	 * 参数 ： 账户名
	 * 返回 ： 账户对象
	 */
	public Account findAccountByName(String Username) throws Exception;
	
}
