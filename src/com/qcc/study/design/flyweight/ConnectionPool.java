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
 * 主要目的是实现资源的共享,即共享池,比如数据库连接池
 *  通过连接池的管理,实现了数据库连接的共享,不需要每次使用都重新创建连接,
 *  接省了数据库的开销,提升系统的性能
 *
 */
public class ConnectionPool {

    private Vector<Connection> connections;

    private String driverClassName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql:///test";
    private String username = "root";
    private String password = "1230";

    private int poolSize = 100;

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
    public synchronized void release(Connection conn){
        connections.add(conn);
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
}
