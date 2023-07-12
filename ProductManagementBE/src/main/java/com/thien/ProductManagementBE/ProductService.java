package com.thien.ProductManagementBE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
