package dev.vishwanath.productservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/products/")
public class ProductController {


    @GetMapping
    public void getAllProducts(){

    }
    //Localhost:8080/products/123
    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") Long id){
        return "here is the product id : " + id;

    }

    @DeleteMapping("{id}")
    public void deleteProductById(){

    }

     @PostMapping
    public void  createProduct(){

    }

    @PutMapping("{id}")
    public void updateProductById(){

    }

}
