package com.practice.demo;

import javax.servlet.http.HttpServlet;
import java.sql.*;

public class Validate extends HttpServlet {

    public boolean isValidUser(String user, String pass) throws ClassNotFoundException, SQLException {
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        con = DriverManager.getConnection(url,"root","Admin@123");
        String getUser = "select * from user where username=? and password = ?;";

        PreparedStatement st = con.prepareStatement(getUser);
        st.setString(1,user);
        st.setString(2,pass);
        ResultSet result = st.executeQuery();



        if(result.next()) {
            String us = result.getString("username");
            String pas = result.getString("password");
            if (us.equals(user) && pas.equals(pass)) {
                return true;
            }
        }
        return false;
    }
}
