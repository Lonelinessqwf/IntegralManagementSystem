package test;

import java.sql.*;

public class test {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/java-integral?characterEncoding=utf8&useSSL=false";
 
    static final String USER = "root";
    static final String PASS = "a3901077";
 
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
            System.out.println("实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "select * from account";
            ResultSet rs = stmt.executeQuery(sql);
        
            while(rs.next()){
                String name = rs.getString("USERNAME");
    
                System.out.print(",站点名称:: " + name);
                System.out.print("\n");
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}