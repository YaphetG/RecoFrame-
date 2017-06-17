package com.recom.web.framework.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.recom.web.framework.AbsRequestChainHandler;

public class AuditRequestChainHandler extends AbsRequestChainHandler {

	@Override
	public HttpServletResponse handleRequest(HttpServletRequest request, HttpServletResponse response) {
		StringBuilder sb = new StringBuilder();
		sb.append("Req local addr : "+request.getLocalAddr());
		sb.append("Req remote addr : "+request.getRemoteAddr());
		// We can write this to a log file or an analytics engine
		System.out.println(sb.toString());
		
		return super.getSuccessor().handleRequest(request, response); // forward it to the next one
	}

}
