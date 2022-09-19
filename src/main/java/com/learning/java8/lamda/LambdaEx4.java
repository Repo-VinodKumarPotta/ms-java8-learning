package com.learning.java8.lamda;

import com.learning.java8.config.ExampleData;
import com.learning.java8.config.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

//Variable used in lambda expression should be final or effectively final
//We should avoid changing the state of object or variable if we use inside Lambda expression.
public class LambdaEx4 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger (LambdaEx4.class);

        List<Product> products = ExampleData.getProducts ();

        BigDecimal priceLimit = new BigDecimal (6);

        int numberOfCheapProducts = 0;
        //Traditional looping
        for (Product product : products) {
            if(product.getPrice ().compareTo (priceLimit) < 0) {
                numberOfCheapProducts++;
            }
        }

        logger.info (""+numberOfCheapProducts);

        //Foreach method and Lambda expression
        /*
        products.forEach (product -> {
            if(product.getPrice ().compareTo (priceLimit) < 0) {
                logger.info (numberOfCheapProducts++); // ERROR NOT allowed --> Variable used in lambda expression should be final or effectively final
            }
        });*/
    }
}
