package com.jideani.letslogin.service;

import com.jideani.letslogin.entity.LoginData;
import com.jideani.letslogin.util.MysqlConnect;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class LoginService {

    public String login(LoginData loginData) {
        String retdata = "Invalid credential";
        String sql = "select * from user where username =? and password =?";
        Connection conn = MysqlConnect.ConnectDB();
        PreparedStatement pst; //connect a session between java application and mysql database
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, loginData.getUsername());
            pst.setString(2, loginData.getPassword());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) retdata = "Login successful";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return retdata;
    }
}
