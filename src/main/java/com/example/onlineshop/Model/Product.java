package com.example.onlineshop.Model;

public class Product extends ProductBaner{


    private String Description ;
    private String Category;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
