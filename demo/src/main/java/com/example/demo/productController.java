package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class productController {
    ProductRepository repository=new ProductRepository();
   @RequestMapping("/")
    public String hello (){
       return "hellooooo";
   }

   @GetMapping ("/product")
    public List<product> getProduct (){
       ProductRepository repository=new ProductRepository();

       return repository.getall();
   }

   @GetMapping ("/product/{productId}")
    public product getProduct (@PathVariable String productId){
       System.out.println("productId:"+productId);
     /*  product p1 = new product();
       p1.setName("chicken");
       p1.setPrice("1250.00");
       p1.setDescription("healthy");*/

       product p1=new product("1234","chicken","High protein", "1500", "sf");

return repository.getById(productId);

       //return p1;
   }
@PostMapping("/product")
    public void addProduct(@RequestBody product product){
    ProductRepository repository=new ProductRepository();
       repository.addProduct(product);
}


}
