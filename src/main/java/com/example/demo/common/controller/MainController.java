package com.example.demo.common.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.common.controller.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping("/")
	public ModelAndView main() throws Exception {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		
		List<Map<String, Object>> list = mainService.getList();
		
		model.addObject("list", list);
		
		return model;
	}
}
