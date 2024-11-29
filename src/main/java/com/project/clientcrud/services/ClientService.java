package com.project.clientcrud.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.clientcrud.dto.ClientDTO;
import com.project.clientcrud.entities.Client;
import com.project.clientcrud.repositories.ClientRepository;
import com.project.clientcrud.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Optional<Client> result = repository.findById(id);
        return new ClientDTO(result.orElseThrow(() -> new ResourceNotFoundException("Id não encontrado")));
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }

    @Transactional
    public ClientDTO insert(ClientDTO dto){
        Client entity = new Client();
        dtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ClientDTO(entity);
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO dto){
        try {
            Client entity = repository.getReferenceById(id);
            dtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new ClientDTO(entity);
        } catch (Exception e) {
            throw new ResourceNotFoundException("Id não encontrado");
        }
    }

    @Transactional
    public void delete(Long id){
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Id não encontrado");
        }
        repository.deleteById(id);
    }

    private void dtoToEntity(ClientDTO dto, Client entity){
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }

}
