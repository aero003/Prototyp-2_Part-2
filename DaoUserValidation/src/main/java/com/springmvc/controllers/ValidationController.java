package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.springmvc.validation.Validate;
import com.springmvc.validation.ValidateDao;

@Controller
public class ValidationController 
{
	@Autowired
	ValidateDao dao; 
	
	@RequestMapping("/signUp")
	public String showForm(Model model) 
	{
		model.addAttribute("command", new Validate());
		return "signUp";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("validate")Validate validate) 
	{
	    dao.save(validate);
		return "logIn"; 
	}
	
	@RequestMapping("/message")
	public String display(@RequestParam("username")String username, @RequestParam("password")String password, Model model)
	{
		List<Validate> list = dao.getEmployees();
		String result=""; 
		
		for(Validate value : list) 
		{ 
	    	if((username.equals(value.getUsername())) && (password.equals(value.getPassword()))) 
	    	{
	    		String msg = "Welcome "+username;
				model.addAttribute("message", msg);
				result = "display"; 
				break;
	    	}
	    	else 
	    	{
				String message = "Sorry! "+username+" you have entered wrong user name or password <br> Please! Log In again or Sign Up";
				model.addAttribute("message", message);
				result = "errorpage";
			}
	    }
	    System.out.println("\n");
	    return result;
	}
}
