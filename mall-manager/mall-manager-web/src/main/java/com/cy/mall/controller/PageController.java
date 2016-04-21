package com.cy.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by cy on 2016/4/15.
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex(){
			return "index";
	}

	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
}
