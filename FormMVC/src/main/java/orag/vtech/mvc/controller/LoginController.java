package orag.vtech.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import orag.vtech.mvc.bean.LoginBean;

@Controller
public class LoginController {

	@RequestMapping("/")
	public  ModelAndView beforeLogin()
	{
		return new ModelAndView("login","loggh",new LoginBean());
	}
	@RequestMapping(value="/login.html",method=RequestMethod.POST)
	public ModelAndView doLogin(@Valid@ModelAttribute("log")LoginBean log,BindingResult result)
	{
		if(result.hasErrors())
	{
		return new ModelAndView("login");
	}
	else
	{
		return new ModelAndView("success");
	}
		
	}
}
