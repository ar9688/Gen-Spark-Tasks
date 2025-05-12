package com.example.demo;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class Service {
    @Autowired
    private repository repository;

    @GetMapping
    public List<Employee> getAllEmployee(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getByid(@PathVariable Integer id){
        return repository.findById(id);
    }


}
