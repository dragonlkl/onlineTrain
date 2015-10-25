package com.aleadin.train.startup.yinglinghui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping(value="/ylhIndex", method=RequestMethod.GET)
	public String yinlinghuimain() {
		return "ylhIndex";
	}
	
	@RequestMapping(value="/ylh/ylhmain.json", method=RequestMethod.GET)
	public @ResponseBody String index() {
		return "yinlinghuimain";
	}
	
	@RequestMapping(value="/test")
	public @ResponseBody String test()
	{
		return "test success";
	}
	
	//
	@RequestMapping(value="/ylh/superstarcourse")
	public String superStarCourse()
	{
		return "superstarcourse";
	}
	
	@RequestMapping(value="/ylh/elitecourse")
	public String eliteCourse()
	{
		return "elitecourse";
	}
	
	//
	@RequestMapping(value="/ylh/topicarticle")
	public String topicArticle()
	{
		return "topicarticle";
	}
	
	@RequestMapping(value="/ylh/datebar")
	public String dateBar()
	{
		return "datebar";
	}
	@RequestMapping(value="/careerpreview/onlinecourse")
	public String onlineCourse()
	{
		return "careerpreviewonlinecourse";
	}
	
	@RequestMapping(value="/careerpreview/offlinecourse")
	public String offlineCourse()
	{
		return "careerpreviewofflinecourse";
	}
	
	@RequestMapping(value="/my/accountmgr")
	public String accountMgr()
	{
		return "accountmgr";
	}
	
	@RequestMapping(value="/my/ijionyou")
	public String iJionYou()
	{
		return "ijionyou";
	}
	
	@RequestMapping(value="/my/becomeelite")
	public String becomeElite()
	{
		return "becomeelite";
	}
	
	@RequestMapping(value="/my/eliteclub")
	public String eliteClub()
	{
		return "eliteclub";
	}
	
	@RequestMapping(value="/my/myorder")
	public String myOrder()
	{
		return "myorder";
	}
}
