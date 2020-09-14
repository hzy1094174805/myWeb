package com.xiaohe.jdbc;

import java.sql.*;

/**
 * 1.DriverManager:驱动管理对象
 * 2.Connection:数据库连接对象
 * 3.Statement:执行sql的对象
 * 4.Result：结果集对象
 *
 * @author 何忠宇
 * @version 1.0
 * @date 2020/8/29 22:42
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
//        导入驱动jar包
//        注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=Asia/Shanghai", "root", "root");
//        定义sql语句
        String sql = "update stu set age = 21 where id = 1";
//        获取执行sql对象statement
        Statement stmt = conn.createStatement();
//        执行sql
        int count = stmt.executeUpdate(sql);
//        处理结果
        System.out.println(count);
//        释放资源
        stmt.close();
        conn.close();


    }
}
