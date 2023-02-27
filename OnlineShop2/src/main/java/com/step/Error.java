package com.step;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/error"})

public class Error extends HttpServlet {
    protected void getError(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body align=\"center\" >\n" +
                "<h1 align=\"center\"> Oops! </h1>\n" + "<h1> You shouldn't be here </h1>\n" +
                "<h1> Please, agree with the terms of service first </h1>\n" +
                "    <p align=\"center\"> <a href=\"welcome\"> Return to start page </a> </p>\n" +
                "</body>\n" +
                "</html>");
    }
}
