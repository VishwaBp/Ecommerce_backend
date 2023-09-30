package dev.vishwanath.productservice.services;

import dev.vishwanath.productservice.dtos.FakeStoreProductDto;
import dev.vishwanath.productservice.dtos.GenericProductDto;
import dev.vishwanath.productservice.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    private RestTemplateBuilder restTemplateBuilder;
    private String getProductrequestUrl = "https://fakestoreapi.com/products/{id}";

    private String createProductRequestUrl = "https://fakestoreapi.com/products";
    public FakeStoreProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product){
        RestTemplate  restTemplate = restTemplateBuilder.build();
        ResponseEntity<GenericProductDto>  response  = restTemplate.postForEntity(createProductRequestUrl,product,GenericProductDto.class);
        return response.getBody();
    }

    @Override
    public GenericProductDto getProductById(Long id) {

        RestTemplate restTemplate = restTemplateBuilder.build();
      ResponseEntity<FakeStoreProductDto> response =  restTemplate.getForEntity(getProductrequestUrl, FakeStoreProductDto.class,id);
      FakeStoreProductDto fakeStoreProductDto = response.getBody();
      GenericProductDto product = new GenericProductDto();
      product.setImage(fakeStoreProductDto.getImage());
      product.setCategory(fakeStoreProductDto.getCategory());
      product.setPrice(fakeStoreProductDto.getPrice());
      product.setDescription(fakeStoreProductDto.getDescription());

      response.getStatusCode();
      return product;


    }
}
