/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClass;

import Connection.dbutil.DBconnection;
import Pojo.ViewFacultyProfilePojo;
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
public class ViewFacultyProfileDao {
    public static ViewFacultyProfilePojo getFact(String facultyId) throws SQLException, IOException{
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            ViewFacultyProfilePojo  faculty = null;
            String sql = "select * from facultyCandidate where id=" + facultyId + ";";
            conn = DBconnection.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String facultyID = rs.getString("faculty_id");
                Date dob = rs.getDate("dob");
                String department = rs.getString("department");
                String qualification = rs.getString("qualification");
                Date doj = rs.getDate("doj");
                String gender = rs.getString("gender");
                String mobileNo = rs.getString("mobile_no");
                String email = rs.getString("email");
                String bio = rs.getString("bio");            
                faculty = new ViewFacultyProfilePojo(firstName,lastName,facultyID,dob,department,qualification,doj,gender,mobileNo,email,bio);
            }
          return faculty;
        }
}
