package com.athul.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController 
{
	//http://localhost:8080/home?addr=athul&name=me&rollnoo=3
	@RequestMapping("home")
	public ModelAndView home(Student st)
	{
		ModelAndView mv =new ModelAndView();
		mv.addObject("obj",st);
		mv.setViewName("home");
		return mv;
	}
	
	
	
//		http://localhost:8080/home?name=athul
//		@RequestMapping("home")
//		public ModelAndView home(@RequestParam("name") String Myname)
//		{
//			ModelAndView mv =new ModelAndView();
//			mv.addObject("name",Myname);
//			mv.setViewName("home");
//			return mv;
//		}
	
	
//	Method 1
//	@RequestMapping("home")
//	public String home(String name, HttpSession session)
//	{
//		System.out.println("Test spsring : "+name);
//		session.setAttribute("name", name);
//		return "home";
//	}
}
