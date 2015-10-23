package com.aleadin.train.startup.yinglinghui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping(value="/ylh", method=RequestMethod.GET)
	public String yinlinghuimain() {
		return "yinlinghuimain";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value="/test")
	public @ResponseBody String test()
	{
		return "eeeeeeee";
	}
}
