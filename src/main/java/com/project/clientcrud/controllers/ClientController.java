package com.project.clientcrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.clientcrud.dto.ClientDTO;
import com.project.clientcrud.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping("/{id}")
    public ClientDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
    
}