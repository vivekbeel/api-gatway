package com.learn.microservice.apigateway.loginfilter;

import org.slf4j.Logger;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;


import reactor.core.publisher.Mono;

@Component
public class LoginFilter implements GlobalFilter{

	
	private Logger logger=org.slf4j.LoggerFactory.getLogger(LoginFilter.class);
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		logger.info("path of the request:: "+exchange.getRequest().getPath());
		return chain.filter(exchange);
	}

}
