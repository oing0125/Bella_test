package com.oing0125.bella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

	@RequestMapping(value="/")
	public String intro(){
		return "index";
	}
}
