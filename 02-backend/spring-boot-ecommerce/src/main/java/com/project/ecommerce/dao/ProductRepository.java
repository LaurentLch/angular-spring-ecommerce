package com.project.ecommerce.dao;

import com.project.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    //QUERY METHOD
    //Find by category id ex: http://localhost:8080/api/products/search/findByCategoryId?id=1
    Page<Product> findByCategoryId(@RequestParam("id")Long id, Pageable pageable);

    //Find by name ex: http://localhost:8080/api/products/search/findByNameContaining?name=Python
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

}
