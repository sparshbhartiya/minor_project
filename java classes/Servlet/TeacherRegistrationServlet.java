/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import static DaoClass.TeacherRegisterDao.*;
import Pojo.TeacherRegisterPojo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author saura
 */

@MultipartConfig(maxFileSize = 16177215)
@WebServlet(name = "TeacherRegistrationServlet", urlPatterns = {"/TeacherRegistrationServlet"})
public class TeacherRegistrationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
                PrintWriter out = response.getWriter();
                // gets values of text fields
                
                String firstName = request.getParameter("firstname");
                String lastName = request.getParameter("lastname");
                String facultyId = request.getParameter("facultyid");
                String dob = request.getParameter("dob");
                String department = request.getParameter("department");
                String qualification = request.getParameter("qualification");
                String doj = request.getParameter("doj");
                String gender = request.getParameter("gender");
                String mobileNo=request.getParameter("phone");
                String email=request.getParameter("email");
                String bio=request.getParameter("bio");
                String type;
                type = "hod";
                
                TeacherRegisterPojo re = new TeacherRegisterPojo(firstName,lastName,facultyId,dob,department,qualification,doj,gender,mobileNo,email,bio,type);
                
                CandidateRegister(re);
                TeacherRegister(re);
                response.sendRedirect("AdminPage.jsp");
            } 
         catch(SQLException ex)
         {
             
         }
         
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
