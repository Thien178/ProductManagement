package com.thien.ProductManagementBE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

//    Simple Approach:
//    List<Product> products = new ArrayList<>();

//    public void addProduct(Product p){
//        products.add(p);
//    }

//    public List<Product> getAllProducts() {
//        return products;
//    }

//    public Product getProduct(String name){
//        for(Product p : products){
//            return p;
//        }
//        return null;
//    }

//    public List<Product> getProductWithText(String text) {
//        String str = text.toLowerCase();
//        List<Product> prods = new ArrayList<>();
//        for(Product p : products){
//            if(p.getName().toLowerCase().contains(str) || p.getType().toLowerCase().contains(str) || p.getPlace().toLowerCase().contains(str)){
//                prods.add(p);
//            }
//        }
//        return prods;
//    }



//    JDBCAproach:
//    ProductDB db = new ProductDB();

//    public void addProduct(Product p){
//        db.save(p);
//    }

//    public List<Product> getAllProducts() {
//        return db.getAll();
//    }
//
//    public Product getProduct(String name){
//        List<Product> products1 = db.getProduct(name);
//        for(Product p : products1){
//            return p;
//        }
//        return null;
//    }



//    Springboot Approach:

    @Autowired
    ProductDB db;

    public void addProduct(Product p){
        db.save(p);
    }
    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProduct(String name){
        return db.findByName(name);
    }

    public Product getProductById(int id) {
        Optional<Product> optionalProduct = db.findById(id);
        return optionalProduct.orElse(null);
    }

    public List<Product> getProductsByType(String type) {
        return db.findByType(type);
    }

    public List<Product> getProductsByPlace(String place) {
        return db.findByPlace(place);
    }

    public List<Product> getProductsByWarranty(int warranty) {
        return db.findByWarranty(warranty);
    }

    public void updateProduct(Product p) {
        db.save(p);
    }

    public void deleteProduct(int id) {
        db.deleteById(id);
    }


}
