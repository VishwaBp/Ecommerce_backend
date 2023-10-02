package dev.vishwanath.productservice.services;

import dev.vishwanath.productservice.dtos.GenericProductDto;
import dev.vishwanath.productservice.exceptions.NotFoundException;

import java.util.List;

public interface ProductService {

    GenericProductDto createProduct(GenericProductDto product);
    GenericProductDto getProductById(Long id) throws NotFoundException;

    List<GenericProductDto> getAllProducts();
    GenericProductDto deleteProduct(Long id);
}
