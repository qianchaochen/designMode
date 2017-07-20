package com.qcc.study.design.flyweight;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author: qiancc
 * 2017年07月19日
 *
 * 享元模式:
 *
 * 适合做为共享的那些个对象，都具有共同的属性，比如数据库连接池中的连接对象，拥有url,username,password,driverClassName,
 * 这些属性对于数据库的连接来说都是一样的，所以适合使用享元模式
 *
 * 主要目的是实现资源的共享,即共享池,比如数据库连接池
 *  通过连接池的管理,实现了数据库连接的共享,不需要每次使用都重新创建连接,
 *  接省了数据库的开销,提升系统的性能
 *
 */
public class ConnectionPool {

    private Vector<Connection> connections;

    private String driverClassName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://18.8.10.90:3306/nfc_pay_db";
    private String username = "dba";
    private String password = "hlw_mysql";

    private int poolSize = 10;

    /**初始化连接池*/
    private ConnectionPool(){
        connections = new Vector<>();
        for(int i=0; i<poolSize; i++) {
            try {
                Class.forName(driverClassName);
                Connection conn = DriverManager.getConnection(url, username, password);
                connections.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /*返回连接到连接池*/
    public synchronized void release(Connection conn) throws SQLException {
        connections.add(conn);
        conn.close();
    }

    /*从连接池中取出连接,然后把Vector中对应的连接移除.*/
    public synchronized Connection getConn() {
        if (connections.size() > 0) {
            Connection connection = connections.get(0);
            connections.remove(connection);
            return connection;
        }else{
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        ConnectionPool pool = new ConnectionPool();
        Vector<Connection> connections = pool.connections;
        System.out.println(connections);
        System.out.println("--------------------------");
        Connection conn = pool.getConn();
        System.out.println(conn);
        System.out.println(connections);
        System.out.println("--------------------------");
        pool.release(conn);
        System.out.println(conn);
        System.out.println(connections);
    }
}
