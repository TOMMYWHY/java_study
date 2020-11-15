package test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class XXOOTest {

    @Test
    public void jdbcTest() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");  //通过静态代码块来注册驱动
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql///user",
                "root",
                "jt123456");
    }
}
