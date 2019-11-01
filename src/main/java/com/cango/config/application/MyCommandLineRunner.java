package com.cango.config.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author
 * @description
 * @date 2019/10/31
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("myCommandLineRunner.run()执行了"+ Arrays.asList(args));
    }
}
