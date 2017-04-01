package com.dava;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//给视图设置值
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World");
		
		//跳转到的页面
		mv.setViewName("hello");

		return mv;
	}

}
