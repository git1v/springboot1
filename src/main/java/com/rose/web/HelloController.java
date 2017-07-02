package com.rose.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rose.web.MyDataEntity;
import com.rose.web.MyDataEntityRepository;

@Controller
public class HelloController {
	@Autowired
	MyDataEntityRepository repository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("title","Helo Page");
		model.addAttribute("message", "MyDataEntity List.");
		List<MyDataEntity> data=repository.findAll();
		model.addAttribute("data",data);
		return "helo";
	}
	

}
