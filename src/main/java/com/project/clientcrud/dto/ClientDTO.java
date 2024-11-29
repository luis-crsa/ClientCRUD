package com.project.clientcrud.dto;

import java.time.LocalDate;

import com.project.clientcrud.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {

    private Long id;
    @NotBlank(message = "Nome requerido")
    private String name;
    private String cpf;
    private Double income;
    @PastOrPresent(message = "Data deve ser válida")
    private LocalDate birthDate;
    private Integer children;
    
    public ClientDTO() {
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
    
}
