package com.pms.cde.pensionerDisbursementMicroservice.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name="auth-service",url = "http://3.110.108.65:7001/auth")
public interface AuthorizationServiceClient {
	
	@PostMapping(value = "/authorize")
	public boolean authorizeRequest(@RequestHeader(value = "Authorization",required = true) String header);
	
}
