package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController 
{
	@RequestMapping(value="/products",method = RequestMethod.GET)
	public ModelAndView productHomePage()
	{
		System.out.println("am in product controller");
		return new ModelAndView("products");
	}
	
	@RequestMapping(value="/addProduct",method = RequestMethod.GET)
	public ModelAndView productsView()
	{
		System.out.println("am in product controller");
		return new ModelAndView("addProduct");
	}

}
