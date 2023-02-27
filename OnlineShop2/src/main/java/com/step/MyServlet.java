package com.step;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/welcome"})
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Welcome</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/shop\" method=\"get\">\n" +
                "<h1 align=\"center\" > Welcome to Online Shop </h1>\n" +
                "    <div></div>\n" +
                "    <div></div>\n" +
                "    <p align=\"center\"> <input type=\"text\" placeholder=\"Enter your name\" name=\"userName\"></p>\n" +
                "    <div></div>\n" +
                "    <p align=\"center\"> <input type=\"checkbox\" value=\"check\">I agree with the terms of service</p>\n" +
                "    <div></div>\n" +
                "    <p align=\"center\"> <input type=\"submit\" value=\"Enter\"></p>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }
}