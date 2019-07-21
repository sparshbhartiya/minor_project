/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import static DaoClass.AdminLoginDao.*;
import Pojo.AdminPojo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author saura
 */
@WebServlet(name = "Admin", urlPatterns = {"/Admin"})
public class Admin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
            throws ServletException, IOException{
       
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
        PrintWriter out = response.getWriter();
       try
       {
       response.setContentType("text/html;charset=UTF-8");
       String username=request.getParameter("uid");
       String password=request.getParameter("psw");
       AdminPojo AdminInfo= new AdminPojo(username,password);
               
       String AdminName= validateAdmin(AdminInfo);
       
       if(AdminName!=null)
       {
       HttpSession session = request.getSession();
       session.setAttribute("username", AdminName);
       
       request.setAttribute("AdminName", AdminName);
       RequestDispatcher dispatcher = request.getRequestDispatcher("/AdminPage.jsp");
       dispatcher.forward(request, response);
       }
       else
       {
       out.println("<b><br>Sorry you cannot login ,invalid userid,password</b><a href='AdminLogin.jsp'><br>Try again</a><a href='FrontPage.jsp'><br>HomePage</a>");
       }
       }
    
       catch(SQLException ex)
       {
       out.println("<b>server is having some problem .Try again later</b>"+ex);
       ex.printStackTrace();
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
