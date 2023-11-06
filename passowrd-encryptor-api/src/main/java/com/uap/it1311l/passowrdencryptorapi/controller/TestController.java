/**
 * 
 */
package com.uap.it1311l.passowrdencryptorapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gabby
 *
 */

@RestController
public class TestController {

	  @GetMapping("/test")
	  public String testApi() {
	    return "test passed";
	  }
	
}
