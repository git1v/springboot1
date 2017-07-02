package com.rose.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("title", "Practice Page");
		model.addAttribute("message","this is made in Controller");
		return "helo";
	}
	
    @RequestMapping(value="/", method=RequestMethod.POST)
    public String form(@RequestParam("input1")String input1, Model model){
        String res="あなたは「"+input1+"」と入力しました。";
        model.addAttribute("title", "Answer Page");
        model.addAttribute("message", res);
        return "helo";
    }
}
