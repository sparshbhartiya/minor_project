/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Connection.dbutil.DBconnection;
import java.awt.BasicStroke;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.jdbc.JDBCCategoryDataset;


/**
 *
 * @author saura
 */
@WebServlet(name = "ViewGraphServlet", urlPatterns = {"/ViewGraphServlet"})
public class ViewGraphServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
        private Connection conn = null;
        
        public ViewGraphServlet() {
                conn = DBconnection.getConnection();
        }

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
                ResultSet rs=null;
                String department=request.getParameter("department");
                String command=request.getParameter("command");
                
           if(command.equals("hod"))
           {
               
           try{                      
                JDBCCategoryDataset dataSet = new JDBCCategoryDataset(conn);

                dataSet.executeQuery("select fname,vcount from teacher_cand  where branch='"+ department +"'order by vcount" );

                JFreeChart chart = ChartFactory.createBarChart3D("HOD VOTING GRAPH","Name","Votes", dataSet);

                chart.setBorderPaint(Color.black);
                chart.setBorderStroke(new BasicStroke(10.0f));
    
                if (chart != null) 
                {
                        chart.setBorderVisible(true);
                        int width = 900;
                        int height = 600;
                        response.setContentType("image/jpeg");
                        OutputStream out = response.getOutputStream();
                        ChartUtilities.writeChartAsJPEG(out, chart, width, height);
                }
        }
           
            catch (SQLException e) 
                {
                        System.err.println("No way");
                        System.err.println(e.getMessage());
                }
    }
           
           else
           {     
     try{           
              JDBCCategoryDataset dataset = new JDBCCategoryDataset(conn);

                dataset.executeQuery("select fname,vcount from student_cand  where branch='"+ department +"'order by vcount" );
                 
                JFreeChart chart = ChartFactory.createBarChart3D("STUDENT VOTING GRAPH","Name","Votes", dataset);
                
                 chart.setBorderPaint(Color.black);
                 chart.setBorderStroke(new BasicStroke(10.0f));
                
                System.err.println("Hello Welcome");
                if (chart != null) 
                {
                        chart.setBorderVisible(true);
                        int width = 900;
                        int height = 600;
                        response.setContentType("image/jpeg");
                        OutputStream out = response.getOutputStream();
                        ChartUtilities.writeChartAsJPEG(out, chart, width, height);
                }
             }
                catch (SQLException e) 
                {
                        System.err.println("No way");
                        System.err.println(e.getMessage());
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
