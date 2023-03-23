package com.fundamentos.springboot.Cliente.infrastructure.adapter;

import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import com.fundamentos.springboot.Cliente.domain.service.ClienteUpdateService;
import com.fundamentos.springboot.Cliente.infrastructure.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteUpdateAdapter implements ClienteUpdateService {

  private final ClienteRepository clienteRepository;

  @Transactional
  public void updateCliente(Cliente cliente) {
    clienteRepository.updateCliente(cliente.getId(),
                                    cliente.getName(),
                                    cliente.getLastname());

  }
}
