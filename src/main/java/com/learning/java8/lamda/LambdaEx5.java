package com.learning.java8.lamda;

import com.learning.java8.config.ExampleData;
import com.learning.java8.config.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LambdaEx5 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger (LambdaEx5.class);

        List<Product> products = ExampleData.getProducts ();

        BigDecimal priceLimit = new BigDecimal (6);

        // By using traditional foreach loop expression
        List<Product> numberOfCheapProducts = new ArrayList<> (  );
        for (Product product : products) {
            if(product.getPrice ().compareTo (priceLimit) < 0) {
                numberOfCheapProducts.add (product);
            }
        }

        // By using Foreach method and Lambda expression
        //We should avoid changing the state of object or variable if we use inside Lambda expression.
        List<Product> numberOfCheapProductsLambda = new ArrayList<> (  );
        products.forEach (product -> {
            if (product.getPrice ().compareTo (priceLimit) < 0){
                numberOfCheapProductsLambda.add (product);
            }
        });

        logger.info (""+numberOfCheapProducts.size ());
    }
}
