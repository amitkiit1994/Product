package com.automation.bot.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.automation.bot.learning.model.Products;
import com.automation.bot.learning.service.ProductsService;

@Controller
@RequestMapping("/products")
public class ProductsModelWebController {
	@Autowired
	private ProductsService prodService;
	
	
	@GetMapping
	public String getAllProds(Model model) {
		List<Products> prods= prodService.getAllProds();
		model.addAttribute("products", prods);
		return "products";
	}
}
