/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.ViewStudentProfilePojo;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author saura
 */
public class ViewStudentProfileDao {
    public static ViewStudentProfilePojo getStudent(String studentId) throws SQLException, IOException{
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            ViewStudentProfilePojo  student = null;
            String sql = "select * from studentCandidate where id=" + studentId + ";";
            conn = DBconnection.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String enrollNo = rs.getString("enroll_no");
                Date dob = rs.getDate("dob");
                Date doj = rs.getDate("doj");
                String branch = rs.getString("branch");
                String year = rs.getString("year");
                String gender = rs.getString("gender");
                String mobileNo = rs.getString("mobile_no");
                String email = rs.getString("email");
                String bio = rs.getString("bio");            
               student = new ViewStudentProfilePojo(firstName,lastName,enrollNo,dob,branch,year,gender,mobileNo,email,bio);
            }
          return student;
        }
}
