package com.restworks.rest.works.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("USER-DETAILS")
public interface UserDetailsProxy {
	
	@GetMapping("/user-details/{name}")
	public String getUseAddress( @PathVariable String name);
}
