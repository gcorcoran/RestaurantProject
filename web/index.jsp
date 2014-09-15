<%-- 
    Document   : index.jsp
    Created on : Sep 13, 2014, 4:42:04 PM
    Author     : Greg
--%>

<%@page import="java.util.List"%>
<%@page import="model.Category"%>
<%@page import="model.DataAccessService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <header>
        <span class="leading">carmen's</span><span class="ending">BAR & GRILL</span>
    </header>
    <body>
            <%
                DataAccessService data = new DataAccessService();
                List<Category> categories = data.getCategories();
                for(int i = 0;i<categories.size();i++){
                    out.print("<div class=\"box\">");
                    out.print("<div class=\"categories\">" + categories.get(i).getName() + "</div>"+ "<br>");
                    for(int j = 0;j<categories.get(i).getItems().size();j++){
                        
                        out.print("<form id=\"singleItem\" name=\"item\" method=\"POST\" action=\"CartController\">");
                        
                        out.print("<div class=\"itemName\" name=\"name\">" + categories.get(i).getItems().get(j).getName()+ "</div>"+ "<br>");
                        out.print("<div class=\"itemDescription\" name=\"description\">" + categories.get(i).getItems().get(j).getDescription()+ "</div>"+ "<br>");
                        out.print("<div class=\"itemPrice\" name=\"price\">" + categories.get(i).getItems().get(j).getPrice()+ "</div>");
                        out.print("<input type=\"submit\" name=\"submit\" /></form>");
                    }
                    out.print("</div>");
                }
            %>
            
            <div class="cart">
                <%
            Object obj = request.getAttribute("cart");
            if (obj == null) {
                out.println("<h1>RESULTS WILL SHOW HERE</h1>");
            } else {
                out.println("<h1>" + obj.toString() + "</h1>");
                //out.println("<h1>" + obj.toString() + "</h1>");
            }
        %>
            </div>
    </body>
</html>
