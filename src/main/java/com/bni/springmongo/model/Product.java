package com.bni.springmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("products")
public class Product {
    @Id
    private String id;
    private String name;
    private Integer qty;
    private Float price;
    private List<String> tags;
}
