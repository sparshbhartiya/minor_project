/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.VotingCandDetailPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author saura
 */
public class VotingCandDetailDao {
     public static ArrayList<VotingCandDetailPojo> CandidateDetail(String branch,String type) throws SQLException
    {
       Connection conn=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       
       ArrayList<VotingCandDetailPojo> CandDetail=new ArrayList<>();
       if(type.equals("student"))
       {
       try{
       conn= DBconnection.getConnection();
       String qry="select * from student_cand where branch=?";
       ps=conn.prepareStatement(qry);
       ps.setString(1,branch);
       rs=ps.executeQuery();
       
       while(rs.next())
       {
            VotingCandDetailPojo v=new VotingCandDetailPojo();
            v.setId(rs.getString("id"));
            v.setFname(rs.getString("fname"));
            v.setLname(rs.getString("lname"));
            v.setBranch(rs.getString("branch"));           
            CandDetail.add(v);       
       }
       /*System.out.println(CandDetail.toString());*/
       }
        catch(SQLException ex)
       {
           System.out.println("error");
           ex.printStackTrace();
       }   
        
       }
       
       
       else if(type.equals("hod"))
       {
       try{
       conn= DBconnection.getConnection();
       String qry="select * from teacher_cand where branch=?";
       ps=conn.prepareStatement(qry);
       ps.setString(1,branch);
       rs=ps.executeQuery();
       
       while(rs.next())
       {
            VotingCandDetailPojo v=new VotingCandDetailPojo();
            v.setId(rs.getString("id"));
            v.setFname(rs.getString("fname"));
            v.setLname(rs.getString("lname"));
            v.setBranch(rs.getString("branch"));           
            CandDetail.add(v);       
       }
       }
        catch(SQLException ex)
       {
           System.out.println("error");
           ex.printStackTrace();
       }   
        
       }
       /*System.out.println(CandDetail.toString());*/
         return CandDetail;
    }
}
