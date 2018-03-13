package org.launchcode.controllers;

import javax.servlet.http.HttpServletRequest;

import org.launchcode.model.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by LaunchCode
 */
@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloForm() {
		return "helloForm";
	}
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(HttpServletRequest request, Model model) {
    			
    			String name = request.getParameter("name");
    			/*
    			if(name == null || name == "") {
    				name = "world";
    			}
    			*/
    			model.addAttribute("name", name);
    			return "hello";
    }
}
