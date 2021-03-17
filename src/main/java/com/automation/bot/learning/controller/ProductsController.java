package com.automation.bot.learning.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.automation.bot.learning.model.Products;
import com.automation.bot.learning.service.ProductsService;


@RestController
@RequestMapping("/api")
public class ProductsController {
	@Autowired
	private ProductsService prodService;


	@GetMapping("/products")
	public List<Products> getAllProds() {
		return prodService.getAllProds();
	}

	@GetMapping("/products/{id}")
	public Products getProdById(@PathVariable UUID id) {
		return prodService.getProdById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/products")
	public void addProd(@RequestBody Products prod) {
		prodService.addProd(prod);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
	public void updateProd(@RequestBody Products prod, @PathVariable UUID id) {
		prodService.updateProd(prod,id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
	public void delProd(@PathVariable UUID id) {
		prodService.deleteProd(id);
	}
}
