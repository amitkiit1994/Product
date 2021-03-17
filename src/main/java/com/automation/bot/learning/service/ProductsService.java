package com.automation.bot.learning.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automation.bot.learning.dao.ProductsRepository;
import com.automation.bot.learning.model.Products;


@Service
public class ProductsService {

	@Autowired
	private ProductsRepository prodRepo;
	
	public List<Products> getAllProds() {
		ArrayList<Products> prods = new ArrayList<Products>();
		for (Products prod : prodRepo.findAll()) {
			prods.add(prod);
		}
		return prods;
	}

	public Products getProdById(UUID id) {
		return prodRepo.findById(id).get();
	}
	

	public void addProd(Products prod) {
		prod.setProdId(UUID.randomUUID());
		prodRepo.save(prod);
	}

	public void updateProd(Products prod,UUID id) {
		prod.setProdId(id);
		prodRepo.save(prod);
	}

	public void deleteProd(UUID id) {
		prodRepo.deleteById(id);
	}
}
