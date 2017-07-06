package com.te2.subscriptionMicroSvc;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CruiseInfoController {
	
	 private static final String template = "Welcome to TE2 Subscription, %s!";
	 private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/cruiseinfo")
	    public CruiseInfo cruiseinfo(@RequestParam(value="name", defaultValue="elite customer") String name) {
	        return new CruiseInfo(counter.incrementAndGet(),
	                            String.format(template, name));
	    }

}
