package com.companyname.springapp.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lib.classTI.clase;
import lib.db.HelloDB;

@Controller
public class HelloJson {
	@RequestMapping(value="/titulo/getDatos", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<clase>getVariable() throws Exception{
		ArrayList<clase> cl = new ArrayList<clase>();
		cl = HelloDB.getVariable();
		return cl;
	}
}

