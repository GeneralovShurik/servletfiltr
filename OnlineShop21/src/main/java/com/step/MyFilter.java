package com.step;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = ("/shop"))

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;

//        if(request.getSession().getAttribute("userName") == null {
//            req.setUserName(request, request.getParameter("userName"));
//        } else if (request.getParameter("userName") != null && !request.getSession().getAttribute("userName").equals(request.getParameter("userName"))) {
//            request.getSession().invalidate();
//            req.setUserName(request, request.getParameter("userName"));
//        }

        if (request.getSession().getAttribute("check") == null) {
            if (request.getParameter("check") == null) {
                String path = "/error";
                ServletContext servletContext = request.getServletContext();
                RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
                requestDispatcher.forward(request, resp);
            } else {
                request.getSession().setAttribute("check", request.getParameter("check"));
            }
        }
        chain.doFilter(req, resp);
    }
    @Override
    public void destroy() {

    }
}

