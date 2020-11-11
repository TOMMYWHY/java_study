package com.java_web.druid;

import com.java_web.util.JDBC_DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo02 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt =null;
        try {
             conn = JDBC_DruidUtils.getConnection();
            String sql = "insert into student values(4,?,?,null,null,null) ";
             pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"cao");
            pstmt.setInt(2,100);

            int count = pstmt.executeUpdate();
            System.out.println(count);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBC_DruidUtils.close(pstmt,conn);
        }


    }
}
