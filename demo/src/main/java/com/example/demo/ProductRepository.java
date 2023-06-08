package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    Map<String , product> database=new HashMap<>();

    public ProductRepository(){
        product p1=new product("1234","chicken","High protein", "1500", "sf");
        product p2=new product("2235","pork","High protein dg", "0", "sf2");
        product p3=new product("4566","breef","High protein", "15000", "sf3");

        database.put("1234",p1);
        database.put("2235",p2);
        database.put("4566",p3);
    }

    public product getById(String id){
        return database.get(id);

    }
    public List<product> getall(){

        return database.values().stream().toList();
    }

    public void addProduct(product product){

        database.put(product.getId(),product );
    }

}
