<%-- 
    Document   : checkout.jsp
    Created on : Sep 17, 2014, 9:11:59 PM
    Author     : gcorcoran
--%>

<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <title>Confirmation Page</title>
    </head>
    <body>
        <div class="box">
            <%
                Object obj2 = session.getAttribute("cart");
                Cart cart = (Cart) obj2;
                if (cart == null) {
                    //out.println("<h1>RESULTS WILL SHOW HERE</h1>");
                } else {
                    out.print("<div class=\"box\">");
                    out.print("<div class=\"itemName\">" + "You Selected:" + "</div>" + "<br>");
                    out.println("<p>" + cart.toString() + "</p>");
                    out.print("</div>");
                }

            %>
            <form method="POST" action="MainController?action=checkout">
                <input type="submit" name="submit" value="Go To Checkout"/>
            </form>
        </div>
    </body>
</html>
