package com.companyname.springapp.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lib.classTI.clase;
import lib.db.HelloDB;

@Controller
public class HelloController {

    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value="/inicio")
    public ModelAndView inicio(Model model, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        model.addAttribute("javaScriptPage", "inicio");      
        return new ModelAndView("inicio");
    }
    @RequestMapping(value="/perfil")
    public ModelAndView perfil(Model model, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	model.addAttribute("javaScriptPage", "perfil");
        
        return new ModelAndView("perfil");
    }
    @RequestMapping(value="/login")
    public ModelAndView login(Model model, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	model.addAttribute("javaScriptPage", "login");
        
        return new ModelAndView("login");
    }
    @RequestMapping(value="/curriculum")
    public ModelAndView curriculum(Model model, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	model.addAttribute("javaScriptPage", "curriculum");
        
        return new ModelAndView("curriculum");
    }
//    @RequestMapping(value="/titulo/getDatos", method = {RequestMethod.GET, RequestMethod.POST})
//	public @ResponseBody ArrayList<clase>getVariable() throws Exception{
//		ArrayList<clase> cl = new ArrayList<clase>();
//		cl = HelloDB.getVariable();
//		return cl;
//	}
}