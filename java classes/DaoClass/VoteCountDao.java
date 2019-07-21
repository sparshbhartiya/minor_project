/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.CandDetailPojo;
import Pojo.VoterDetailPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author saura
 */
public class VoteCountDao {
    
     public static boolean CandidateCount(CandDetailPojo candDetail) throws SQLException
     {
         int i=0;
       try
       {
       Connection conn=DBconnection.getConnection();
       PreparedStatement ps=null;
       if(candDetail.getCandType().equals("student"))
        ps=conn.prepareStatement("update student_cand set vcount=vcount+1 where id=?");
       else
        ps=conn.prepareStatement("update teacher_cand set vcount=vcount+1 where id=?");
       
       ps.setString(1, candDetail.getCandId());
      
       i=ps.executeUpdate();
       }
        catch(SQLException ex)
       {
           System.out.println("error1");
           ex.printStackTrace();
       }
       
       if(i==0)
         return false;
         else
         return true;  
     }
     
     
     
     public static boolean Voted_Voter_Detail(VoterDetailPojo voterDetail,CandDetailPojo candDetail) throws SQLException
     {
         int i=0;
         try
         {
       Connection conn=DBconnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into voterdetail values(?,?,?,?,?,?,?,?,?)");
       ps.setString(1, voterDetail.getVoterId());
       ps.setString(2, voterDetail.getVoterfName());
       ps.setString(3, voterDetail.getVoterlName());
       ps.setString(4, voterDetail.getVoterBranch());
       ps.setString(5, voterDetail.getVoterType());
       ps.setString(6, candDetail.getCandId());
       ps.setString(7, candDetail.getCandFname());
       ps.setString(8, candDetail.getCandLname());
       ps.setString(9, candDetail.getCandType());
       i=ps.executeUpdate();
         }
         
         catch(SQLException ex)
       {
           System.out.println("error2");
           ex.printStackTrace();
       }
         if(i==0)
         return false;
         else
         return true;  
     }
     
     
     
      
     public static boolean Non_Voted(VoterDetailPojo voterDetail) throws SQLException
     {
         int i=0;
         try
         {
       Connection conn=DBconnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("delete from non_voted where voterid=?");
       ps.setString(1,voterDetail.getVoterId());
       i=ps.executeUpdate();
         }
     
     
     catch(SQLException ex)
       {
           System.out.println("error1");
           ex.printStackTrace();
       }
     
     if(i==0)
         return false;
         else
         return true;  
     }
     
     
     
     public static boolean Voted(VoterDetailPojo voterDetail,CandDetailPojo candDetail) throws SQLException
     {
         int i=0;
         try
         {
       Connection conn=DBconnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into voted values(?,?,?,?,?,?)");
       ps.setString(1, voterDetail.getVoterId());
       ps.setString(2, voterDetail.getVoterfName());
       ps.setString(3, voterDetail.getVoterlName());
       ps.setString(4, voterDetail.getVoterBranch());
       ps.setString(5, voterDetail.getVoterType());
       ps.setString(6, candDetail.getCandType());
       i=ps.executeUpdate();
         }
     
     
     catch(SQLException ex)
       {
           System.out.println("error1");
       }
     
     
     if(i==0)
         return false;
         else
         return true;
     }
}
