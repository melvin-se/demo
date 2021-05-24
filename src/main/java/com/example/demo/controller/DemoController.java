package com.example.demo.controller;

import com.example.demo.entity.DemoEntity;
import com.example.demo.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.awt.print.Book;

@Controller
@RequestMapping("/book")
public class DemoController {

    @Autowired
    DemoRepo demoRepo;

    private String name;
    private String authorname;
    private int pages;


    @RequestMapping("/update")
    public void update(){
        DemoEntity book = new DemoEntity("java","hf",233);
        demoRepo.save(book);
    }
}