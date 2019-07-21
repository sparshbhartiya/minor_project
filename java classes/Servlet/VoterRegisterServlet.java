/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import static DaoClass.VoterRegisterDao.*;
import Pojo.VoterRegisterPojo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author saura
 */
@WebServlet(name = "VoterRegisterServlet", urlPatterns = {"/VoterRegisterServlet"})
public class VoterRegisterServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
           try {
                PrintWriter out = response.getWriter();
                // gets values of text fields
                
                String firstName = request.getParameter("firstname");
                String lastName = request.getParameter("lastname");
                String voterid = request.getParameter("voterid");
                String dob = request.getParameter("dob");
                String branch = request.getParameter("branch");
                String year = request.getParameter("year");
                String gender = request.getParameter("gender");
                String votertype = request.getParameter("votertype");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String aadharno = request.getParameter("aadharno");
                System.out.println(aadharno);
                
                VoterRegisterPojo v = new VoterRegisterPojo(firstName,lastName,voterid,dob,branch,year,gender,votertype,phone,email,password,aadharno);
                
                VoterRegister1(v);
                VoterRegister2(v);
                response.sendRedirect("FrontPage.jsp");
            } 
         catch(SQLException ex)
         {
             
         }
         
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
        processRequest(request, response);
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
        processRequest(request, response);
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
