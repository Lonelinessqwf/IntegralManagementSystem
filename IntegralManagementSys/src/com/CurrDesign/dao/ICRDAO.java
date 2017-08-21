package com.CurrDesign.dao;

import com.CurrDesign.model.IntegralChangeRecord;

public interface ICRDAO {

	/*
	 * 根据积分记录ID查询信息
	 * 参数 : 积分记录ID
	 * 返回 ： 积分记录对象(ICR)
	 */
	public IntegralChangeRecord findICRByID(String ICRID) throws Exception;
}
