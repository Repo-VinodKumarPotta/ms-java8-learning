package com.learning.java8.config;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static com.learning.java8.config.Category.FOOD;
import static com.learning.java8.config.Category.UTENCILS;
import static com.learning.java8.config.Category.CLEANING;
import static com.learning.java8.config.Category.OFFICE;

public class ExampleData {

    private static final List<Product> PRODUCTS = Arrays.asList (
            new Product (FOOD, "Oranges", new BigDecimal (1.65)),
            new Product (FOOD, "Cheese", new BigDecimal (6.79)),
            new Product (UTENCILS, "Plates", new BigDecimal (1.7)),
            new Product (CLEANING, "Detergent", new BigDecimal (1.8)),
            new Product (FOOD, "Soft drink", new BigDecimal (1.9)),
            new Product (OFFICE, "Pencils", new BigDecimal (1.1)),
            new Product (FOOD, "Rice", new BigDecimal (1.5)),
            new Product (CLEANING, "Scourer", new BigDecimal (1.90)),
            new Product (FOOD, "Milk", new BigDecimal (1.80)),
            new Product (OFFICE, "Notebook", new BigDecimal (1.60)),
            new Product (FOOD, "Tea", new BigDecimal (1.66)),
            new Product (FOOD, "Tomato Sauce", new BigDecimal (1.69))
            );

    public static List<Product> getProducts() {
        return PRODUCTS;
    }
}
