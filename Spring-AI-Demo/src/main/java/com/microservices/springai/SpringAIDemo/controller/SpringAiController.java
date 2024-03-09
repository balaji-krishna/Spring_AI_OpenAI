package com.microservices.springai.SpringAIDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.springai.SpringAIDemo.service.SpringAiService;

@RestController
@RequestMapping(path = "/springAi")
public class SpringAiController {
	
	@Autowired
	private SpringAiService springAiService;
	
	@GetMapping("getOpenAiResult/{inputPromptMessage}")
	public String getOpenAiResult(@PathVariable String inputPromptMessage) {
		return springAiService.getOpenAiResult(inputPromptMessage);
	}
	
	

}
