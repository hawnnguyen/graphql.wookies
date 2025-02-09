package com.solo.demo.graphql.wookies.graphqlserver;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldResolver {

    @QueryMapping
    public String hello() {
        return "Hello, World!";
    }
}