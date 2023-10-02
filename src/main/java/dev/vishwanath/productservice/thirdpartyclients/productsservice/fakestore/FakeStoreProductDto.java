package dev.vishwanath.productservice.thirdpartyclients.productsservice.fakestore;

import dev.vishwanath.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private long id;
    private String title;
    private String description;
    private String image;
    private String category;
    private  double price;
}
