/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.StudentRegisterPojo;
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
public class StudentRegisteredDao {
     public static void CandidateRegister(StudentRegisterPojo t) throws SQLException{
     Connection conn = null;
     PreparedStatement ps=null;// connection to the database
       try 
       {
        System.out.println(t.toString());
        conn = DBconnection.getConnection();
        String sql = "insert into registered_student values (?,?,?,?,?,?,?,?,?,?,?,?)";
        ps= conn.prepareStatement(sql);
        ps.setString(1,t.getFirstName());
        ps.setString(2,t.getLastName());
        ps.setString(3,t.getStudentId());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d1 = sdf.parse(t.getDob());
        java.sql.Date d2 = new java.sql.Date(d1.getTime());
        ps.setDate(4,d2);
        System.out.println(d2);
        
        ps.setString(5,t.getDepartment());
        ps.setString(6,t.getQualification());
                    
        java.util.Date d3 = sdf.parse(t.getDoj());
        java.sql.Date d4 = new java.sql.Date(d3.getTime());
        ps.setDate(7,d4);
        System.out.println(d4);
        
        ps.setString(8,t.getGender());
        ps.setString(9,t.getMobileNo());
        ps.setString(10,t.getEmail());
        ps.setString(11,t.getBio());
        ps.setString(12,t.getType());
        // sends the statement to the database server
        int i = ps.executeUpdate();
        System.out.println(i);
        
        if(i>0)
        {
            System.out.println("Successfully");
        }
     
        } 
        catch (SQLException ex) 
        {
           System.out.println("error1");
        }
       catch (ParseException ex) 
        {
           System.out.println("error2");
        }
        
    }

    
     public static void StudentRegister(StudentRegisterPojo t) throws SQLException{
        Connection conn = null;
        PreparedStatement ps=null;// connection to the database
       try 
       {
        int vcount=0;
        /*System.out.println(v.toString());*/
        conn = DBconnection.getConnection();
        String sql = "insert into student_cand values (?,?,?,?,?)";
        ps= conn.prepareStatement(sql);
        ps.setString(2,t.getFirstName());
        ps.setString(3,t.getLastName());
        ps.setString(1,t.getStudentId());        
        ps.setString(4,t.getDepartment());
        ps.setInt(5,vcount);
        
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
        ResultSet rs=st.executeQuery("select count(*) from registered_student");
        int id=101;
        if(rs.next())
        {
            id=id+rs.getInt(1);
        }
        return "S"+id;
     }
    
}
