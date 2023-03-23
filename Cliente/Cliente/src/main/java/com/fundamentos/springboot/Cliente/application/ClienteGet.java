package com.fundamentos.springboot.Cliente.application;

import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import com.fundamentos.springboot.Cliente.domain.service.ClienteGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ClienteGet {

  private ClienteGetService clienteGetService;

  public List<Cliente> getAll() {
    return clienteGetService.getAll();

  }

  public Cliente get(String id) {
    return clienteGetService.get(id);
  }
}
