package com.crud.beststore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.beststore.models.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
