package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weichaojwc
 * @date 19/6/27
 */

@RestController
public class HelloworldController {

    @RequestMapping(value = "/", method = { RequestMethod.GET })
    public String sayHi() {
        return "Helloworld !";
    }
}
