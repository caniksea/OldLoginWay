package com.jideani.letslogin.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class MysqlConnect {
    
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "password");
            return conn;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
