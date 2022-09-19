package com.learning.java8.lamda;

import com.learning.java8.config.ExampleData;
import com.learning.java8.config.Product;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.math.BigDecimal;
import java.util.List;

 //Traditional way of working with Lambda
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

}
