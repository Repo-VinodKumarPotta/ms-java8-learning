package com.learning.java8.lamda;

import com.learning.java8.config.ExampleData;
import com.learning.java8.config.Product;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.math.BigDecimal;
import java.util.List;

//Functional way of working with Lambda
public class LambdaEx2 {
    private static final Logger logger = LoggerFactory.getLogger (LambdaEx2.class);

    @FunctionalInterface
    interface ProductFilter {
        boolean accept(Product product);
    }

    public static void pritProducts (List<Product> products, ProductFilter filter){
        for (Product product : products)
            if (filter.accept (product)) {
                logger.info(product.toString ());
            }
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts ();
        BigDecimal priceLimit = new BigDecimal (5.0);
        ProductFilter filter = product -> product.getPrice ().compareTo (priceLimit) > 0;
        LambdaEx2.pritProducts (products,filter);

        /*//**** Any local variable that we use in lambda expression must be effectively final
        //This means we are not allowed to alter the local variable  data with lambda expression.
        //It try this will through an exception
        //Ex. codes are below
        List<Product> products = ExampleData.getProducts ();
        BigDecimal priceLimit = new BigDecimal (5.0);
        //priceLimit = new BigDecimal (4.0); --> Not allowed
        ProductFilter filter = product -> product.getPrice ().compareTo (priceLimit) > 0;
        //priceLimit = new BigDecimal (4.0); --> Not allowed
        LambdaEx2.pritProducts (products,filter);
        //priceLimit = new BigDecimal (4.0); --> Not allowed*/
    }

}

/* //Traditional way of working with Lambda
public class LambdaEx2 {
    private static final Logger logger = LoggerFactory.getLogger (LambdaEx2.class);
    public static void pritProducts (List<Product> products, BigDecimal priceLimit){
        for (Product product : products)
            if (product.getPrice ().compareTo (priceLimit) > 0) {
                logger.info(product.toString ());
            }
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts ();
        BigDecimal priceLimit = new BigDecimal (5.0);
        LambdaEx2.pritProducts (products,priceLimit);
    }

}*/
