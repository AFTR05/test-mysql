package org.example.service.impl;

import org.example.model.Product;
import org.example.model.ProductCategory;
import org.example.repository.impl.ProductCategoryRepostoryImp;
import org.example.service.ProductService;

import java.util.ArrayList;

public class ProductCategoryServiceImpl implements ProductService {

    ProductCategoryRepostoryImp repository=new ProductCategoryRepostoryImp();
    @Override
    public void getlist() {
        System.out.println("------------LIST PRODUCTS------------");
        ArrayList<ProductCategory> products=(ArrayList<ProductCategory>) repository.list();
        System.out.println(products);
    }

    @Override
    public void getbyId(Long id) {
        System.out.println("------------GET PRODUCT BY ID------------");
        System.out.println(repository.byId(id));
    }

    @Override
    public void save(Object o) {
        System.out.println("------------SAVE PRODUCT------------");
        repository.save(o);
    }

    @Override
    public void delete(Long id) {
        System.out.println("------------DELETE PRODUCT------------");
        repository.delete(id);
    }

    @Override
    public void update(Long id,Object o) {
        System.out.println("------------UPDATE PRODUCT------------");
        repository.update(id,o);
    }
}
