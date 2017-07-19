package com.qcc.study.design.bridge;

import java.sql.*;
import java.util.*;

/**
 * @author: qiancc
 * 2017年07月19日
 */
public class JDBCDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://18.8.10.90:3306/nfc_pay_db";
            String user = "dba";
            String password = "hlw_mysql";
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select * from nfc_buscard_busi_ctrl_info_tb";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<Bus> list = new ArrayList<>();
            while (rs.next()) {
                String operation = rs.getString(1);
                String status = rs.getString(2);
                java.util.Date create_date = rs.getDate(3);
                Time create_time = rs.getTime(4);
                Time last_up_time = rs.getTime(5);
                Bus bus = new Bus(operation, status, create_date, create_time, last_up_time);
                System.out.println(bus);
                list.add(bus);
            }
            System.out.println("---------------------------------------------------------");
            for (Bus bus : list) {
                System.out.println(bus);
            }
            System.out.println("---------------------------------------------------------");



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("未找到驱动");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("获取connection失败.");
        }

    }
}
