package com.CurrDesign.dao;

import com.CurrDesign.model.Present;

public interface PresentDAO {

	/*
	 * 根据礼物ID查询信息
	 * 参数 : 礼物ID
	 * 返回 ： 礼物对象
	 */
	public Present findPresentByID(String PresentID) throws Exception;
}
