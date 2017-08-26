# IntegralManagementSystem

DataBase(数据库名字为 db_IntegralManagementSys)
注意点：
	（1）所有ID（账户ID，积分ID，礼品ID等）都作为当前表的唯一主键，而且默认数据类型为定长字符串（12位）。
	（2）ID 12位，为了区分ID类型，前两位为特殊字段，账户为 "AC**********", 账户为 "IG**********"，依次类推，礼品字段为PS，积分历史记录为IC，兑换记录为PE。
	（3）所有积分类型固定为int（6），6为显示宽度，比如6显示为 “000006”，不代表实际数据大小。
	（4）待定

账户			Account	
（
	账户ID，	userID			char(12)	not null | unique | primary key
	用户名，	userName		varchar		not null | unique
	登录密码，	password		varchar		not null
	真实姓名，	realName		varchar
	入网日期，	netInDate		date		not null
	出生年月，	birth			date		
	联系电话，	telephone		char(11)	not null | unique
	地址，		address			varchar		
	账户等级，	level			int(4)		not null
	现有总积分	currentIntegral	int(6)		not null
）

积分			Integral
（
	积分ID，	integralID		char(12)	not null | unique | primary key
	账户ID，	userID			char(12)	not null | foreign key
	积分类型，	integralType	int(4)		not null
	分值，		value			int(6)		not null
	获得日期，	startDate		date		not null
	截止日期	expDate			date		not null
）

积分记录		IntegralChangeRecord
（
积分记录ID，	changeID		char(12)	not null | unique | primary key			
积分ID，        integralID      char(12)    not null | foreign key 
变化分值，		changeValue     int(6)      not null                
变化时间，   	changeTime      datetime    not null                     
变化原因，      reason          int(4)      not null            
原因补充		reasonExtra		char(12)    
）

礼品			Present
（
礼品ID，		presentID		char(12)	not null | unique | primary key			
礼品类型，		presentType		int(4)      not null 
礼品价值，		presentPrice	double(2)   not null                
消耗积分，		costIntegral	int(6)      not null                     
礼品数量		presentNum		int(8)      not null            
）

兑换记录		PresentExchangeRecord
（
兑换记录ID，	exchangeID		char(12)	not null | unique | primary key			
礼品ID，		presentID		char(12)    not null | foreign key 
兑换日期		exchangeTime	datetime	not null
）

优先级			Priority
(
)

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
