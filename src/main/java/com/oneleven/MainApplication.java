package com.oneleven;

import com.oneleven.lambda.Lambda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

        Lambda l = new Lambda();
        l.test();
    }

}
