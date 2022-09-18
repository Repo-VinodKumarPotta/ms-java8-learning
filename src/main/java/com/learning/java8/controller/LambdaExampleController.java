package com.learning.java8.controller;

import com.learning.java8.lamda.LambdaEx1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java/v1")
public class LambdaExampleController {
    private static final Logger logger = LoggerFactory.getLogger (LambdaExampleController.class);
    @PostMapping("/lambda")
    public void runJavaMethods(){
        LambdaEx1 lambdaEx1 = new LambdaEx1 ();
        lambdaEx1.lamdaEx ();
    }
}
