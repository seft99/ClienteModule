package com.fundamentos.springboot.Cliente.domain.service;
import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import java.util.List;

public interface ClienteGetService {

    Cliente get(String id);
    List<Cliente> getAll();
}
