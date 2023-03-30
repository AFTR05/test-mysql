package org.example.application;

import org.example.ConnectionBD;
import org.example.model.Product;
import org.example.service.impl.ProductServiceImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class MainProducto {
    public static void main(String[] args) {
        try (Connection conn = ConnectionBD.getInstance()){
            ProductServiceImpl productService=new ProductServiceImpl();
            productService.getlist();
            productService.getbyId(1L);
            productService.delete(2L);
            productService.getlist();
            productService.save(new Product("Keke",5000.0, LocalDate.of(2023,03,27)));
            productService.getlist();
            productService.update(1L,new Product("Empanada",500.0, LocalDate.of(2023,03,27)));
            productService.getlist();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
