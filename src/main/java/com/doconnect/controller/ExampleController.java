package com.doconnect.controller;

import java.util.ArrayList;
import java.util.Arrays;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doconnect.model.ExamplePojoModel;

//@Controller
@RestController
public class ExampleController {	

	@GetMapping("/info")
//	@ResponseBody
	public ExamplePojoModel get() {
		ExamplePojoModel examplePojoModel = new ExamplePojoModel("king", 2, Arrays.asList(1, 3));
		return examplePojoModel;
	}
	
}
