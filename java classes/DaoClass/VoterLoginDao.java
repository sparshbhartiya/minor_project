/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.VoterPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author saura
 */
public class VoterLoginDao {
    public static ArrayList<VoterPojo> validateVoter(VoterPojo user) throws SQLException
    {
       Connection conn=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       
       ArrayList<VoterPojo> VoterInfo=new ArrayList<>();
       try{
       conn= DBconnection.getConnection();
       String qry="select * from non_voted where voterid=? and password=? and votertype=? and voterbranch=? and eligibility='y' ";
       ps=conn.prepareStatement(qry);
       ps.setString(1,user.getUserId());
       ps.setString(2,user.getPassword());
       ps.setString(3,user.getUserType());
       ps.setString(4,user.getUserBranch());
       rs=ps.executeQuery();
       
       if(rs.next())
       {
            VoterPojo v=new VoterPojo();
            v.setUserfName(rs.getString("vfirstname"));
            v.setUserlName(rs.getString("vlastname"));
            v.setUserId(rs.getString("voterid"));
            v.setPassword(rs.getString("password"));
            v.setUserType(rs.getString("votertype"));
            v.setUserBranch(rs.getString("voterbranch"));
            VoterInfo.add(v);       
       }
       }
        catch(SQLException ex)
       {
           System.out.println("error");
           ex.printStackTrace();
       }
      
        return VoterInfo;
        
    }
}
