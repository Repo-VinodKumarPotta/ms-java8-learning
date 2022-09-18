package com.learning.java8.lamda;

import com.learning.java8.config.ExampleData;
import com.learning.java8.controller.LambdaExampleController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.learning.java8.config.Product;

import java.util.Comparator;
import java.util.List;

public class LambdaEx1 {
    private static final Logger logger = LoggerFactory.getLogger (LambdaEx1.class);

    public static void lamdaEx(){
        List<Product> products = ExampleData.getPRODUCTS ();
        //logger.info (products.toString ());


       /* products.sort (new Comparator<Product> ( ) {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice ().compareTo (o2.getPrice ());
            }
        });*/

        /*products.sort ((Product o1, Product o2) -> {
            return o1.getPrice ().compareTo (o2.getPrice ());
        });*/

        products.sort ((o1,o2) -> o1.getPrice ().compareTo (o2.getPrice ()));


        for(Product product: products){
            logger.info (product.toString () );
        }
    }

    public static void main(String[] args) {
        LambdaEx1.lamdaEx ();
    }
}
