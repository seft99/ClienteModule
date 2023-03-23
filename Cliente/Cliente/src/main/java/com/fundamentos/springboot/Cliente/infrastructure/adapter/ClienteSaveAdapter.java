package com.fundamentos.springboot.Cliente.infrastructure.adapter;

import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import com.fundamentos.springboot.Cliente.domain.service.ClienteSaveService;
import com.fundamentos.springboot.Cliente.infrastructure.mapper.ClienteMapper;
import com.fundamentos.springboot.Cliente.infrastructure.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteSaveAdapter implements ClienteSaveService {
  private final ClienteRepository clienteRepository;
  private final ClienteMapper clienteMapper;
@Override
  public Cliente saveCliente(Cliente cliente){
    return clienteMapper.toClienteEntity(clienteRepository.save(clienteMapper.toClienteDto(cliente)));
  }
}
