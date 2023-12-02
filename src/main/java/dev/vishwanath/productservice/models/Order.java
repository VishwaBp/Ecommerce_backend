package dev.vishwanath.productservice.models;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Order extends BaseModel{
    @ManyToMany
    private List<Product> product;
}
