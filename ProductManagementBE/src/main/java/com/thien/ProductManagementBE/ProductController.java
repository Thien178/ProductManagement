package com.thien.ProductManagementBE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name) {
        return service.getProduct(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }

    @GetMapping("/product/id/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/products/type/{type}")
    public List<Product> getProductsByType(@PathVariable String type) {
        return service.getProductsByType(type);
    }

    @GetMapping("/products/place/{place}")
    public List<Product> getProductsByPlace(@PathVariable String place) {
        return service.getProductsByPlace(place);
    }

    @GetMapping("/products/warranty/{warranty}")
    public List<Product> getProductsByWarranty(@PathVariable int warranty) {
        return service.getProductsByWarranty(warranty);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product p) {
        service.updateProduct(p);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
    }

}
