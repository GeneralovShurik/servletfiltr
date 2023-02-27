package com.step;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/bill"})

public class ThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body align=\"center\" >\n" +
                "<h1 align=\"center\"> Dear </h1>\n" + InstrumentsForShop.getTheResult() + InstrumentsForShop.resultOutput(InstrumentsForShop.MyList.toArray(new String[0]))+
                "\n" +
                "</body>\n" +
                "</html>");
    }
}


