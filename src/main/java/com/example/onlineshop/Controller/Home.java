package com.example.onlineshop.Controller;

import com.example.onlineshop.Model.Product;

import com.example.onlineshop.Model.ProductBaner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class Home {

    @GetMapping
    public  Post(){
        return ;
    }

    @GetMapping("{Category}")
    public  Post(@PathVariable String Category){
        return ;
    }

    @GetMapping("/SpecificePost/{ID}")
    public List getPost(@PathVariable String ID){
        return
    }



}
