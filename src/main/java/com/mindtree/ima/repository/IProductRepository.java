package com.mindtree.ima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.ima.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
