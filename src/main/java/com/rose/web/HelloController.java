package com.rose.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@Autowired
	MySpringBean bean;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("title", "Practice Page");
		model.addAttribute("message","this is made in Controller");
		return "helo";
	}
	
    @RequestMapping(value="/", method=RequestMethod.POST)
    public String form(@RequestParam("input1")int input1, Model model){
    	MyData data=bean.get(input1);
    	model.addAttribute("title", "Answer Page");
        model.addAttribute("message", data);
        return "helo";
    }
}
