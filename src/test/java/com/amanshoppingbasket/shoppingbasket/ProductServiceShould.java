package com.amanshoppingbasket.shoppingbasket;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.amanshoppingbasket.shoppingbasket.ProductType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductServiceShould {

    @ParameterizedTest
    @CsvSource({
            "Lord of the Rings, 10001, BOOK",
            "Breaking Bad, 10002, DVD"
    })
    void return_product_with_corresponding_id_given(String expectedProductName, int expectedId, ProductType expectedProductType) throws ProductNotRecogonisedExeception {
        ProductService productService = new ProductService();

        Product expectedLordOfTheRings = productService.getProductById(expectedId);

        assertEquals(expectedProductName, expectedLordOfTheRings.getName());
        assertEquals(expectedId, expectedLordOfTheRings.getId());
        assertEquals(expectedProductType, expectedLordOfTheRings.getProductType());
    }

    @Test
    void throw_exception_if_incorrect_id_supplied() {


        ProductService productService = new ProductService();

       assertThrows(ProductNotRecogonisedExeception.class, () -> productService.getProductById(0000));

    }
}
