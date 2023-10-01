package dev.vishwanath.productservice.controllers;

import dev.vishwanath.productservice.dtos.GenericProductDto;
import dev.vishwanath.productservice.exceptions.ExceptionDto;
import dev.vishwanath.productservice.exceptions.NotFoundException;
import dev.vishwanath.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController()
@RequestMapping("/api/v1/products/")
public class ProductController {
    private ProductService productService;
    public ProductController (@Qualifier("FakeStoreProductService") ProductService  productService){
        this.productService = productService;
    }
    @GetMapping
    public List<GenericProductDto> getAllProducts(){
        return productService.getAllproducts();
    }
    //Localhost:8080/products/123
    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id) throws NotFoundException{
        return productService.getProductById(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<GenericProductDto> deleteProductById(@PathVariable("id") Long id){
        return new  ResponseEntity<>(
        productService.deleteProductById(id),
            HttpStatus.OK
        );
    }
     @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto product){
       return  productService.createProduct(product);
    }
    @PutMapping("{id}")
    public void updateProductById(){
    }


}
