package com.amanshoppingbasket.shoppingbasket;

public class Product {
    private final int id;
    private final String name;
    private final int price;
    private final ProductType productType;

    public Product(int id, String name, int price, ProductType book) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productType = book;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ProductType getProductType() {
        return productType;
    }
}
