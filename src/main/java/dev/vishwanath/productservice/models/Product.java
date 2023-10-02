package dev.vishwanath.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Entity
@Builder
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;
    @ManyToOne
    private Category category;
    private  double price;

    public Product(String title, String description, String image, Category category, double price) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.category = category;
        this.price = price;
    }

    public Product() {

    }
}
