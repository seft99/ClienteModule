package com.fundamentos.springboot.Cliente.application;

import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import com.fundamentos.springboot.Cliente.domain.service.ClienteUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteUpdate {
  private final ClienteUpdateService clienteUpdateService;

  public void updateCliente(Cliente cliente){ clienteUpdateService.updateCliente(cliente);


  }
}
