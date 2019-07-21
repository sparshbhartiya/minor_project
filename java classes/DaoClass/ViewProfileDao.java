/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.ViewProfilePojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author saura
 */
public class ViewProfileDao {
    public static ArrayList<ViewProfilePojo> ViewStudent(String branch) throws SQLException{
        ArrayList<ViewProfilePojo> students = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
             conn= DBconnection.getConnection();
            String sql="select fname,lname,id from registered_student where branch=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,branch);
            rs = ps.executeQuery();
            while(rs.next())
            {
                ViewProfilePojo v=new ViewProfilePojo();
                v.setId(rs.getString("id"));
                v.setFname(rs.getString("fname"));
                v.setLname(rs.getString("lname"));         
                students.add(v);   
            }   
        }
        catch(SQLException e){
            
        }
        
   return students;
    }
    
    
     public static ArrayList<ViewProfilePojo> ViewFaculty(String branch) throws SQLException{
        ArrayList<ViewProfilePojo> students = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
             conn= DBconnection.getConnection();
            String sql="select fname,lname,id from registered_teacher where branch=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,branch);
            rs = ps.executeQuery();
            while(rs.next())
            {
                ViewProfilePojo v=new ViewProfilePojo();
                v.setId(rs.getString("id"));
                v.setFname(rs.getString("fname"));
                v.setLname(rs.getString("lname"));         
                students.add(v);   
            }   
        }
        catch(SQLException e){
            
        }
        
   return students;
    }
}
