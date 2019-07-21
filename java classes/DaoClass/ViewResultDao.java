/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.ViewResultPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author saura
 */
public class ViewResultDao {
     public static ArrayList<ViewResultPojo> ViewResultStudent(String branch) throws SQLException
    {
       Connection conn=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       
       ArrayList<ViewResultPojo> candInfo=new ArrayList<>();
       try{
       conn= DBconnection.getConnection();
       String qry="select * from student_cand where branch=? order by vcount DESC";
       ps=conn.prepareStatement(qry);
       ps.setString(1, branch);
       rs=ps.executeQuery();
       
       while(rs.next())
       {
            ViewResultPojo v=new ViewResultPojo();
            v.setFname(rs.getString("fname"));
            v.setLname(rs.getString("lname"));
            v.setId(rs.getString("id"));           
            v.setVcount(rs.getString("vcount"));
            candInfo.add(v);       
       }
       }
        catch(SQLException ex)
       {
           System.out.println("error1");
           ex.printStackTrace();
       }
      
        return candInfo;
        
    }
     
     
     
     
     public static ArrayList<ViewResultPojo> ViewResultTeacher(String branch) throws SQLException
    {
       Connection conn=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       
       ArrayList<ViewResultPojo> candInfo=new ArrayList<>();
       try{
       conn= DBconnection.getConnection();
       String qry="select * from teacher_cand where branch=? order by vcount DESC ";
       ps=conn.prepareStatement(qry);
       ps.setString(1, branch);
       rs=ps.executeQuery();
       
       while(rs.next())
       {
            ViewResultPojo v=new ViewResultPojo();
            v.setFname(rs.getString("fname"));
            v.setLname(rs.getString("lname"));
            v.setId(rs.getString("id"));           
            v.setVcount(rs.getString("vcount"));
            candInfo.add(v);       
       }
       }
        catch(SQLException ex)
       {
           System.out.println("error2");
           ex.printStackTrace();
       }
      
        return candInfo;
        
    
}
     
      public static int[] Voting(String branch,String type) throws SQLException
    {
       Connection conn=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       
       int Voting[] = new int[3];
       try{
       conn= DBconnection.getConnection();
       String qry="select count(*) from registered_voter where branch=?";
       ps=conn.prepareStatement(qry);
       ps.setString(1, branch);
       rs=ps.executeQuery();
       int count=0;
        if(rs.next())
        {
            count=rs.getInt(1);
            Voting[0]=count;
        }
        
        
       qry="select count(*) from non_voted where voterbranch=? and eligibility='y'";
       ps=conn.prepareStatement(qry);
       ps.setString(1, branch);
       rs=ps.executeQuery();
       if(rs.next())
        {
            count=rs.getInt(1);
            Voting[1]=count;
        }
       
       qry="select count(*) from voted where voterbranch=? and candtype=?";
       ps=conn.prepareStatement(qry);
       ps.setString(1, branch);
       ps.setString(2, type);
       rs=ps.executeQuery();
       if(rs.next())
        {
            count=rs.getInt(1);
            Voting[2]=count;
        }
       
       }
        catch(SQLException ex)
       {
           System.out.println("error2");
           ex.printStackTrace();
       }
      
        return Voting;
        
    
}
}