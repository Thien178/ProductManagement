package com.thien.ProductManagementBE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {

//    JDBC Approach (change interface to class if use JDBC):
//    Connection conn = null;
//    public ProductDB(){
//        try {
//            conn = DriverManager.getConnection("jdbc:postgresql://localhost:1708/thien","postgres","thien1708");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void save(Product p) {
//        String query = "insert into Product (name, type, place, warranty) values (?,?,?,?)";
//        try {
//            PreparedStatement st = conn.prepareStatement(query);
//            st.setString(1,p.getName());
//            st.setString(2, p.getType());
//            st.setString(3, p.getPlace());
//            st.setInt(4, p.getWarranty());
//            st.execute();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public List<Product> getAll() {
//        List<Product> products = new ArrayList<>();
//        String query = "select name,type,place,warranty from Product";
//        try {
//            PreparedStatement st = conn.prepareStatement(query);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()){
//                Product p = new Product();
//                p.setName(rs.getString(1));
//                p.setType(rs.getString(2));
//                p.setPlace(rs.getString(3));
//                p.setWarranty(rs.getInt(4));
//                products.add(p);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return products;
//    }
//
//    public List<Product> getProduct(String name) {
//        List<Product> products = new ArrayList<>();
//        String query = "select name,type,place,warranty from Product where name like ?";
//        try {
//            PreparedStatement st = conn.prepareStatement(query);
//            st.setString(1,"%" + name + "%");
//            ResultSet rs = st.executeQuery();
//            while (rs.next()){
//                Product p = new Product();
//                p.setName(rs.getString(1));
//                p.setType(rs.getString(2));
//                p.setPlace(rs.getString(3));
//                p.setWarranty(rs.getInt(4));
//                products.add(p);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return products;
//    }


//    Springboot Approach
    Product findByName(String name);

}
