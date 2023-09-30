package dev.vishwanath.productservice.services;

import dev.vishwanath.productservice.dtos.GenericProductDto;
import dev.vishwanath.productservice.models.Product;

public interface ProductService {

    GenericProductDto getProductById(Long id);
    GenericProductDto createProduct(GenericProductDto product);
}
