package com.example.onlineshop.Model;

public class ProductBaner {
    protected String Name;
    protected String Category;
    protected String Price;
    protected Integer DiscountPercent;
    protected String ImageURL ;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Integer getDiscountPercent() {
        return DiscountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        DiscountPercent = discountPercent;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }
}
