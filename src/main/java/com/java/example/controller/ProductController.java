package com.java.example.controller;

import com.java.example.entity.Product;
import com.java.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.java.example.service.DemoService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    private final DemoService demoService;

    @Autowired
    public ProductController(DemoService demoService) {
        this.demoService = demoService;
    }


    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }

    @PostMapping("/products")
    public List<Product> findAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }


    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @PutMapping("product")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

 /*
    @GetMapping("home")
    public String homeHtml(Model model){
        return ViewNames.HOME;
    }


    @GetMapping("welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model){
        model.addAttribute("helloMessage",demoService.getHelloMessage(user));
        model.addAttribute("age",age);
        return ViewNames.WELCOME;
    }

     */


}
