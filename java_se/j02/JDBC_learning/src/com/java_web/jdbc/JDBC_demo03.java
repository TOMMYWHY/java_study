package com.java_web.jdbc;

import com.java_web.domain.Student;
import com.java_web.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC_demo03 {
    public static void main(String[] args) {
        List<Student> list = new JDBC_demo03().findAll2();
        System.out.println(list);
    }

    public List<Student> findAll2(){
        ResultSet res = null;
        Statement stmt = null;
        Connection conn = null;
        List<Student> list = null;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//             conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "jt123456");
            conn = JDBCUtils.getConnection();
            String sql = "select * from student";
             stmt = conn.createStatement();
             res = stmt.executeQuery(sql);
            Student student = null;
             list = new ArrayList<>();
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                int  score = res.getInt("score");
                Date birthday = res.getDate("birthday");
                Date insert_time = res.getDate("insert_time");

                student = new Student();
                student.setId(id);
                student.setName(name);
                student.setScore(score);
                student.setBirthday(birthday);
                student.setInsert_time(insert_time);
                list.add(student);
            }


        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(res,stmt,conn);
        }
        return list;
    }
}
