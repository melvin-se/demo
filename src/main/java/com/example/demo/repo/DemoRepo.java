package com.example.demo.repo;
import com.example.demo.entity.DemoEntity;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;


    public interface DemoRepo extends CrudRepository<DemoEntity,Long>{
    }

