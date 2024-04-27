package com.example.CustomerEurekha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class MsgController {
	
	 
	 @GetMapping("/greet")
	 //public String  msg()
	 //{
		// return "good mrng";
	 //}
	 public String getMessage(@RequestParam(value = "message", defaultValue = "Hello") String message) {
	        return message;
	    }
}
