package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping("/test1")
	@ResponseBody
	public Map<String,Object> test1(){
		Map<String,Object> map = new HashMap<>();
		try {
			System.out.println("test1");
			map.put("code", 200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
