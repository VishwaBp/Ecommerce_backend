package dev.vishwanath.productservice.controllers;

import dev.vishwanath.productservice.dtos.GenericProductDto;
import dev.vishwanath.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/products/")
public class ProductController {


    private ProductService productService;

    public ProductController (@Qualifier("FakeStoreProductService") ProductService  productService){
        this.productService = productService;
    }
    @GetMapping
    public void getAllProducts(){

    }
    //Localhost:8080/products/123
    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id){
//        return "here is the product id : " + id;

        return productService.getProductById(id);
    }

    @DeleteMapping("{id}")
    public void deleteProductById(){

    }

     @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto product){
       return  productService.createProduct(product);




    }

    @PutMapping("{id}")
    public void updateProductById(){

    }

}
