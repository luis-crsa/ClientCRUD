package com.project.clientcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clientcrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
