package dev.vishwanath.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;


@Entity
public class Category extends BaseModel{

    private String name;


}
