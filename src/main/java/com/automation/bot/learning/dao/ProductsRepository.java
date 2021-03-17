package com.automation.bot.learning.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.automation.bot.learning.model.Products;

@Repository
public interface ProductsRepository extends CrudRepository<Products, UUID> {

}
