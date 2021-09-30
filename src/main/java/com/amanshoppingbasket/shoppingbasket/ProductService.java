package com.amanshoppingbasket.shoppingbasket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.amanshoppingbasket.shoppingbasket.ProductType.*;

public class ProductService {

    private static List<Product> productsList = new ArrayList<Product>(
            Arrays.asList(
                    new Product(10001, "Lord of the Rings", 10, BOOK),
                    new Product(10002, "Breaking Bad", 7, DVD)
            )
    );

    public Product getProductById(int id) throws ProductNotRecogonisedExeception {
        for (Product product : productsList) {
            if (id == product.getId()) return product;
        }

        throw new ProductNotRecogonisedExeception();
    }
}
