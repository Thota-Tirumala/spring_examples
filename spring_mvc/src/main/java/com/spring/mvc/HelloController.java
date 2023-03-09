package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.AddService;

@Controller
public class HelloController {

	@RequestMapping("/add")
	public ModelAndView display(HttpServletRequest request, HttpServletResponse response)
	{
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
//		int k = i+j;
		AddService as = new AddService();
		int k = as.add(i, j);
		
		ModelAndView mdv = new ModelAndView();
		mdv.setViewName("tiru");
		mdv.addObject("result",k);
		
		return mdv ;
	}
}
