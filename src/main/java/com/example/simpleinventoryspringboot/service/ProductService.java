package com.example.simpleinventoryspringboot.service;

import com.example.simpleinventoryspringboot.model.Product;
import com.example.simpleinventoryspringboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    

    

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    

    public Product updateProduct(Long id, Product newProductDetails) {
        return productRepository.findById(id).map(product -> {
            product.setName(newProductDetails.getName());
            product.setPrice(newProductDetails.getPrice());
            product.setQuantity(newProductDetails.getQuantity());
            return productRepository.save(product);
        }).orElse(null);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    
}
