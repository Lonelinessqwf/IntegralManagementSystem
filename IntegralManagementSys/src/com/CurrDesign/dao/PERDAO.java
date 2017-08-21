package com.CurrDesign.dao;

import com.CurrDesign.model.PresentExchangeRecord;

public interface PERDAO {

	/*
	 * 根据兑换ID查询信息
	 * 参数 : 兑换ID
	 * 返回 ： 兑换对象
	 */
	public PresentExchangeRecord findPERByID(String PERID) throws Exception;
}
