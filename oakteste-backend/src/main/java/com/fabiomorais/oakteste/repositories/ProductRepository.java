package com.fabiomorais.oakteste.repositories;

import com.fabiomorais.oakteste.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
