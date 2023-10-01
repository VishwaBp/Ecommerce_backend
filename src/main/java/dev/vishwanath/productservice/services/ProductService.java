package dev.vishwanath.productservice.services;

import dev.vishwanath.productservice.dtos.GenericProductDto;
import dev.vishwanath.productservice.exceptions.NotFoundException;

import java.util.List;

public interface ProductService {

    GenericProductDto getProductById(Long id) throws NotFoundException;
    GenericProductDto createProduct(GenericProductDto product);

    List<GenericProductDto> getAllproducts();

    GenericProductDto deleteProductById(Long id);
}
