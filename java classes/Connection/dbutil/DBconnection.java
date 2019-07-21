/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author saura
 */
public class DBconnection {
     private static Connection conn;
    static{
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-5DC8PLFO:1521/XE","project1","saurabh"); 
            System.out.println("Connected Successfully to DB");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("error1");
           ex.printStackTrace();
        }
        catch(SQLException ex)
        {
           System.out.println("error2");
           ex.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    
}
