/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.AdminPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author saura
 */
public class AdminLoginDao {
    public static String validateAdmin(AdminPojo user) throws SQLException
    {
        
       Connection conn=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       String username=null;
       try
       {
       conn= DBconnection.getConnection();
       String qry="select username from admin where userid=? and password=?";
       ps=conn.prepareStatement(qry);
       ps.setString(1,user.getUserId());
       ps.setString(2,user.getPassword());
       rs=ps.executeQuery();
       
       if(rs.next())
       {
           username=rs.getString(1);
       }
            
       }
       catch(SQLException ex)
       {
           System.out.println("error");
           ex.printStackTrace();
       }
       
           
        return username;
       
    }
}
