package com.java.example.service;

import com.java.example.entity.Product;
import com.java.example.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProjectRepository repository;

    public Product saveProduct(Product product){
       return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Product Removed: "+id;
    }

    public Product updateProduct(Product product){
        Product exsistingProduct = repository.findById(product.getId()).orElse(null);
        exsistingProduct.setName(product.getName());
        exsistingProduct.setPrice(product.getPrice());
        exsistingProduct.setQuanity(product.getQuanity());
        return repository.save(exsistingProduct);
    }
    public Long getProductCount(){
        return repository.count();
    }

}
