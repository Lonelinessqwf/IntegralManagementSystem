# IntegralManagementSystem

DataBase

账户（账户ID，用户名，登录密码，真实姓名，入网日期，出生年月，联系电话，地址，账户等级，现有总积分）
积分（积分ID，账户ID，分值，获得日期，截止日期）
积分记录（积分记录ID，积分ID，变化分值，变化日期，变化原因，原因补充）

礼品（礼品ID，礼品类型，礼品价值，消耗积分，礼品数量）
兑换记录（兑换记录ID，兑换日期）

project IntegralManagementSys


1)	package com.CurrDesign.core		// 存放核心部件
		connDB.java	// 连接数据库,在其他类里面调用构造函数和close方法即可（已完成）
		****此处注意，在com.CurrDesign目录下有一个ConnDB.properties配置文件，具体登陆参数只需修改配置文件即可
		DAOFactory	//生产各种数据对象
2）	package com.CurrDesign.model	// 存放数据库对象
		Account.java	
		Integral.java
		IntegralChangeRecord.java
		Present.java
		PresentExchangeRecord.java	以上均实现
	
3）	package com.CurrDesign.dao		// 提供数据库操作接口（均为接口类）
		AccountDAO.java
			功能 ：	根据ID查询其他信息	（ID查询内部类）
		IntegralDAO.java
			功能 ：	根据ID查询其他信息	（ID查询内部类）
		ICRDAO.java(Integral Changed Record)
			功能 ：	根据ID查询其他信息	（ID查询内部类）
		PresentDAO.java
			功能 ：	根据ID查询其他信息	（ID查询内部类）
		PERDAO.java(Presents Exchanged Record)
			功能 ：	根据ID查询其他信息	（ID查询内部类）
	
4)	package com.CurrDesign.daoImpl	// 接口实现
		AccountDAOImpl.java
		IntegralDAOImpl.java
		ICRDAOImpl.java
		PresentDAOImpl.java
		PERDAOImpl.java
		
5)	package com.CurrDesign.util		//工具包（比如说打印账单之类的），具体类待定

6）	package com.CurrDesign.form		//ActionForm数据包，用于web传输

7）	package com.CurrDesign.action	//事件类，即之前提到的event
