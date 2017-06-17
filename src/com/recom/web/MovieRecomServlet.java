package com.recom.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.recom.web.core.RecomServlet;
import com.recom.web.framework.impl.BuildHandlerChain;

/**
 * Servlet implementation class MovieRecomServlet
 */
@WebServlet(description = "The end point url of recom ws", urlPatterns = { "/MovieRecomServlet" })
public final class MovieRecomServlet extends RecomServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MovieRecomServlet() {
        BuildHandlerChain buildHandlerChain = new BuildHandlerChain();
        // App developer specify the chain that they want the framework to handle. 
        super.setRequestChainHanlder(buildHandlerChain.setUpReqHandlerChain());
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		super.doGet(request, response); // Call framework functionality
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
