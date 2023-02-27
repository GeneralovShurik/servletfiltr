package com.step;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/shop"})
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Shop</title>\n" +
                "</head>\n" +
                "<body align=\"center\">\n" +
                "<div style=\"font-weight:bold\"><span> Hello </<span>" + req.getParameter("userName") + "<span> ! </span></div>" +
                "\n" +
                "\n" +
                "<form action=\"/bill\" method=\"get\">\n" +
//                " <p> You have already chosen: </p>\n" +
//                "    <h1>\n" +
                "        <select name=\"list\" size=\"=2\" > align=\"center\"\n" +
                "            <option value=\"1\"> Nokia 25$</option>\n" +
                "            <option value=\"2\"> Samsung Galaxy 200$</option>\n" +
                "            <option value=\"3\"> Xiaomi Redmi 120$</option>\n" +
                "            <option value=\"4\"> Iphone 400$</option>\n" +
                "        </select>\n" +
                "     </form>\n" +
                "        <div>\n" +
                "        </div>\n" +
                "        <input type=\"submit\" value=\"Add item\">\n" +
                "     </form>\n" +
                "<form action=\"bill\" metod =\"get\">\n"
                +"<p>"+ InstrumentsForShop.AddSelectItems(req.getParameter("list"))+
                "        <input type=\"submit\" value=\"Submit\">\n" +
                "    </h1>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>\n");
      //  req.getSession().setAttribute("name", req.getParameter("userName"));
    }
}

