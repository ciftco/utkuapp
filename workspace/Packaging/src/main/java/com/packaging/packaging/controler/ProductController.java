package com.packaging.packaging.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/employees/{id}")
    String one(@PathVariable Long id) {

        return "devam " + id.toString();
    }


}
