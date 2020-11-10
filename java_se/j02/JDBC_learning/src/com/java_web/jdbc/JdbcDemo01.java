package com.java_web.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("jdbc");
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db1",
                "root",
                "jt123456");
        String sql = "update  student set age = 31 where id = 1";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
        stmt.close();
        conn.close();
    }
}
