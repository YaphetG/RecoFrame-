package com.recom.web.framework.impl;

import com.recom.web.framework.AbsBuildHandlerChain;
import com.recom.web.framework.AbsRequestChainHandler;
import com.recom.web.framework.defaultimpl.DefaultRequestChainHandler;

public class BuildHandlerChain extends AbsBuildHandlerChain {
	

	@Override
	public AbsRequestChainHandler setUpReqHandlerChain() {
		AbsRequestChainHandler auditRequestChainHandler = new AuditRequestChainHandler();
		AbsRequestChainHandler defaultRequestChainHandler = new DefaultRequestChainHandler();
		auditRequestChainHandler.setSuccessor(defaultRequestChainHandler);
		return auditRequestChainHandler; // client of the COR knows about the start of the request handler
	}
	
	
}
