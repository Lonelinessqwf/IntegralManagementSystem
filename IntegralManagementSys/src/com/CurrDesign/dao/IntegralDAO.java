package com.CurrDesign.dao;

import java.util.ArrayList;
import com.CurrDesign.model.Integral;

public interface IntegralDAO {

	/*
	 * 根据积分ID查询信息
	 * 参数 : 积分ID
	 * 返回 ： 积分对象
	 */
	public Integral findIntegralByID(String IntegralID) throws Exception;
	
	/*
	 * 根据用户ID查询到所有的积分实体
	 * 参数 ： 账户ID
	 * 返回 ： 积分对象的集合
	 */
	public ArrayList<Integral> findMultiIntegralByID(String AccountID) throws Exception;
}
