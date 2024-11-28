package com.project.clientcrud.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.clientcrud.dto.ClientDTO;
import com.project.clientcrud.entities.Client;
import com.project.clientcrud.repositories.ClientRepository;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    public ClientDTO findById(Long id){
        Optional<Client> result = repository.findById(id);
        return new ClientDTO(result.get());
    }
    
}
