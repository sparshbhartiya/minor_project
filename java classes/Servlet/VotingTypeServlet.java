/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "VotingTypeServlet", urlPatterns = {"/VotingTypeServlet"})
public class VotingTypeServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter())
        {
    String[] VoterDetail= new String[5];
    String command = request.getParameter("command");
    VoterDetail[0]=request.getParameter("userfname");
    VoterDetail[1]=request.getParameter("userlname");
    VoterDetail[2]=request.getParameter("usertype");
    VoterDetail[3]=request.getParameter("branch");
    VoterDetail[4]=request.getParameter("userid");
    System.out.println(command);
    
    HttpSession session = request.getSession();
    
    session.setAttribute("S", "notStarted");
    session.setAttribute("H", "notStarted");
    
    if(command.equals("student"))   
    {
        request.setAttribute("VoterDetail", VoterDetail);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/StudPresidentVotingPage.jsp");
        dispatcher.forward(request, response);
    }
    else if(command.equals("hod"))
    {
        request.setAttribute("VoterDetail", VoterDetail);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/HoDVotingPage.jsp");
        dispatcher.forward(request, response);
    }
    
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
