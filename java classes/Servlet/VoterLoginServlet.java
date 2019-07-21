/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import static DaoClass.VoterLoginDao.validateVoter;
import Pojo.VoterPojo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
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
@WebServlet(name = "VoterLoginServlet", urlPatterns = {"/VoterLoginServlet"})
public class VoterLoginServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
       try{
       response.setContentType("text/html;charset=UTF-8");
       String userid=request.getParameter("uid");
       String password=request.getParameter("psw");
       String usertype=request.getParameter("Type");
       String userbranch=request.getParameter("Branch");
      /* out.println(username);
       out.println(password);
       out.println(usertype);
       out.println(userbranch);*/
       VoterPojo VoterInfo= new VoterPojo(userid,password,usertype,userbranch);
       
       ArrayList<VoterPojo> VoterDetail= validateVoter(VoterInfo);
       /*System.out.println(VoterDetail.toString());*/
        if(VoterDetail.isEmpty())
        {
          out.println("<b><br>Sorry you cannot login ,invalid userid,password,usertype,branch</b><a href='VoterLoginPage.jsp'><br>Try again</a><a href='FrontPage.jsp'><br>HomePage</a>");             
        }
        else 
        {
             HttpSession session = request.getSession();
             session.setAttribute("usertype", usertype);
             
            String[] rows=new String[5];
            for(VoterPojo v:VoterDetail)
            {
                rows[0]=v.getUserfName();
                rows[1]=v.getUserlName();
                rows[2]=v.getUserType();
                rows[3]=v.getUserBranch();
                rows[4]=v.getUserId();
            }
               
            
             if(rows[2].equals("student"))
            {
                request.setAttribute("VoterDetail", rows);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/VotingTypePage.jsp");
                dispatcher.forward(request, response);
            }
            if(rows[2].equals("teacher"))
            {
                request.setAttribute("VoterDetail", rows);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/HoDVotingPage.jsp");
                dispatcher.forward(request, response);
            }
           
        }      
      
       }
    
       catch(SQLException ex)
       {
       out.println("<b>server is having some problem .Try again later</b>"+ex);
       ex.printStackTrace();
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
