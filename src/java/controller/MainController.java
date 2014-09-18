/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Category;
import model.DataAccessService;
import model.Item;

/**
 *
 * @author Greg
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

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
        String pageDestination = "/index.jsp";
        String action = request.getParameter("action");
        String ID = request.getParameter("ID");
        Cart myCart = new Cart();
        HttpSession session = request.getSession();
        if (action.equals("getOriginalList")) {
            DataAccessService menu = new DataAccessService();
            List<Category> categories = menu.getCategories();
            request.setAttribute("menuItems", categories);
        } else if (action.equals("addToCart")) {
            DataAccessService menu = new DataAccessService();
            Object obj2 = session.getAttribute("cart");
            if (obj2 != null) {
                myCart = (Cart) obj2;
            }
            ID = request.getParameter("ID");
            myCart.addToCart(menu.getItemByID(ID));
            session.setAttribute("cart", myCart);

        } else if (action.equals("checkout")){
            pageDestination = "/checkout.jsp";
        }

//        String name = request.getParameter("name");
//        String description = request.getParameter("description");
//        String price = request.getParameter("price");
        //Cart myCart = new Cart();
        //Item temp = new Item(name,description,price);
        //myCart.addToCart(temp);
        //String cart = myCart.toString();
        //request.setAttribute("cart", cart);
        RequestDispatcher view = request.getRequestDispatcher(pageDestination);
        view.forward(request, response);
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
