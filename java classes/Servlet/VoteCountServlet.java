/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import static DaoClass.VoteCountDao.*;
import Pojo.CandDetailPojo;
import Pojo.VoterDetailPojo;
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
@WebServlet(name = "VoteCountServlet", urlPatterns = {"/VoteCountServlet"})
public class VoteCountServlet extends HttpServlet {

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
    
    HttpSession sessionT = request.getSession();
    String usertype= (String) sessionT.getAttribute("usertype");
     
    HttpSession session = request.getSession();
    String S=(String) session.getAttribute("S");
    String H=(String) session.getAttribute("H");
    System.out.println(S);
    System.out.println(H);
        try
        {
            String[] VoterDetail= new String[5];
            String[] CandDetail= new String[5];
            
            VoterDetail[0]=request.getParameter("voterfname");
            VoterDetail[1]=request.getParameter("voterlname");
            VoterDetail[2]=request.getParameter("votertype");
            VoterDetail[3]=request.getParameter("voterbranch");
            VoterDetail[4]=request.getParameter("voterid");

            CandDetail[0]=request.getParameter("candfname");
            CandDetail[1]=request.getParameter("candlname");
            CandDetail[2]=request.getParameter("candbranch");
            CandDetail[3]=request.getParameter("candid");
            CandDetail[4]=request.getParameter("candtype");


            VoterDetailPojo voterDetail=new VoterDetailPojo(VoterDetail[4], VoterDetail[2], VoterDetail[3], VoterDetail[0], VoterDetail[1]);
            
            CandDetailPojo candDetail=new CandDetailPojo(CandDetail[3],CandDetail[4],CandDetail[0],CandDetail[1]);

            boolean i;
            
            i=CandidateCount(candDetail);
            if(i)
            System.out.println("successfull");
            
            i=Voted_Voter_Detail(voterDetail,candDetail);
            if(i)
            System.out.println("successfull");
            
            i=Non_Voted(voterDetail);
            if(i)
            System.out.println("successfull");
            
            i=Voted(voterDetail,candDetail);
            if(i)
            System.out.println("successfull");

        if(usertype.equals("student"))
    {
        if(H.equals("hod") && S.equals("notStarted"))
        {
            request.setAttribute("VoterDetail", VoterDetail);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/StudPresidentVotingPage.jsp");
            dispatcher.forward(request, response);
        }
        
        if(S.equals("student") && H.equals("notStarted"))
        {
            request.setAttribute("VoterDetail", VoterDetail);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/HoDVotingPage.jsp");
            dispatcher.forward(request, response);
        }
        
        if(H.equals("hod") && S.equals("student"))
            response.sendRedirect("Logout.jsp");
    }
             
        else
    {
        response.sendRedirect("Logout.jsp");       
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
