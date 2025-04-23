package designPattern.singleton;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSingleton {
    //step 1: create a JDBCSingleton class
    // static member holds only one instance of the JDBCSingleton
    private static JDBCSingleton jdbc;

    //JDBCSingleton prevents the instantiation from any other class
    private JDBCSingleton(){}

    //providing global point of access.

    public static JDBCSingleton getInstance() {
        if(jdbc == null) {
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    // to get the connection from methods like insert, view,...
    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("");
        conn = DriverManager.getConnection(" ");
        return conn;
    }

    public static class GetLocalIpAddress {
        public static void main(String[] args) {
            try {
                InetAddress localhost = InetAddress.getLocalHost();
                System.out.println("IP Address: " + localhost.getHostAddress());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
