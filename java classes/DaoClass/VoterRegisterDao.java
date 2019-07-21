/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.VoterRegisterPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author saura
 */
public class VoterRegisterDao {
     public static void VoterRegister1(VoterRegisterPojo v) throws SQLException{
     Connection conn = null;
     PreparedStatement ps=null;// connection to the database
       try 
       {
        /*System.out.println(v.toString());*/
        conn = DBconnection.getConnection();
        String sql = "insert into registered_voter values (?,?,?,?,?,?,?,?,?,?,?,?)";
        ps= conn.prepareStatement(sql);
        ps.setString(1,v.getFirstName());
        ps.setString(2,v.getLastName());
        ps.setString(3,v.getVoterId());
        System.out.println(v.getDob());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d1 = sdf.parse(v.getDob());
        java.sql.Date d2 = new java.sql.Date(d1.getTime());
        ps.setDate(4,d2);
        
        System.out.println(d2);
        ps.setString(5,v.getBranch());
        ps.setString(6,v.getYear());
        ps.setString(7,v.getGender());
        ps.setString(8,v.getVotertype());
        ps.setString(9,v.getPhone());
        ps.setString(10,v.getEmail());
        ps.setString(11,v.getPassword());
        ps.setString(12,v.getAadharno());
                  
        int i = ps.executeUpdate();
        /*System.out.println(i);*/
        
        if(i>0)
        {
            System.out.println("Successfully");
        }
     
        } 
        catch (SQLException ex) 
        {
           System.out.println("error1");
           ex.printStackTrace();
        }
       catch (ParseException ex) 
        {
           System.out.println("error2");
           ex.printStackTrace();
        }
    }
     
     
     
     public static void VoterRegister2(VoterRegisterPojo v) throws SQLException{
         Connection conn = null;
     PreparedStatement ps=null;// connection to the database
       try 
       {
        /*System.out.println(v.toString());*/
        conn = DBconnection.getConnection();
        String sql = "insert into non_voted values (?,?,?,?,?,?,?)";
        ps= conn.prepareStatement(sql);
        ps.setString(1,v.getVoterId());
        ps.setString(2,v.getFirstName());
        ps.setString(3,v.getLastName());        
        ps.setString(4,v.getBranch());
        ps.setString(5,v.getVotertype());
        ps.setString(6,v.getPassword());
        ps.setString(7,"y");
                  
        int i = ps.executeUpdate();
        /*System.out.println(i);*/
        
        if(i>0)
        {
            System.out.println("Successfully");
        }
     
        } 
        catch (SQLException ex) 
        {
           System.out.println("error1");
           ex.printStackTrace();
        }
     }
     
     public static String GetNewId() throws SQLException{
      Connection conn=DBconnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select count(*) from registered_voter");
        int id=101;
        if(rs.next())
        {
            id=id+rs.getInt(1);
        }
        return "V"+id;
     }
}
