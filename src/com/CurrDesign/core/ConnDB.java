package com.CurrDesign.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.io.InputStream;

public class ConnDB {
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	private static String DB_URL = "jdbc:mysql://110.64.69.104:12380"
	 		+ "/IntegralManagementSys"
	 		+ "?characterEncoding=utf8"
	 		+ "&useSSL=false";
	private static String propFileName = "/com/CurrDesign/connDB.properties";
	
	private Properties prop = new Properties();
	
	// 数据库的用户名与密码
	private static String USER = "root";
	private static String PASS = "admin123";
	
	public Connection conn = null;
	public Statement stmt = null;
	public ResultSet rs = null;
	
	public ConnDB(){
		if(startJDBC())
		{
			System.out.println("Successfully connect to database ...");
		}
	}
	
	/*
	 * 功能：初始化数据库
	 */
	public boolean startJDBC(){
		
		try{
			//通过输入流对象加载Properties文件
		    InputStream in=this.getClass().getResourceAsStream(propFileName);
		    prop.load(in);	
			    
		    //加载参数
		    JDBC_DRIVER = prop.getProperty("JDBC_DRIVER");
		    DB_URL = prop.getProperty("DB_URL");
		    USER = prop.getProperty("USER");
		    PASS = prop.getProperty("PASS");
		    
		    System.out.println(JDBC_DRIVER);
		    System.out.println(DB_URL);
		    System.out.println(USER);
		    System.out.println(PASS);
		      
			// 注册 JDBC 驱动
			Class.forName(JDBC_DRIVER);
	
			// 打开链接
			System.out.println("Waiting for connecting to database ...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch(SQLException se){
			se.printStackTrace();
			return false;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/*
	 * 功能：执行查询语句
	 */
	public ResultSet executeQuery(String sql) {
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(sql);
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return rs;
	}

	/*
	 * 功能:执行更新操作
	 */
	public int executeUpdate(String sql) {
		int result = 0;
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			result = stmt.executeUpdate(sql);
		} catch (SQLException ex) {
			result = 0;
		}
		return result;
	}

	/*
	 * 功能:关闭数据库的连接
	 */
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

}
