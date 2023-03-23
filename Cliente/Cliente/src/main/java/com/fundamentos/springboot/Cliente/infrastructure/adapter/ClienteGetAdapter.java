package com.fundamentos.springboot.Cliente.infrastructure.adapter;

import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import com.fundamentos.springboot.Cliente.domain.service.ClienteGetService;
import com.fundamentos.springboot.Cliente.infrastructure.dto.ClienteDto;
import com.fundamentos.springboot.Cliente.infrastructure.mapper.ClienteMapper;
import com.fundamentos.springboot.Cliente.infrastructure.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ClienteGetAdapter implements ClienteGetService {

  private final ClienteRepository clienteRepository;
  private final ClienteMapper clienteMapper;

  @Override
  public Cliente get(String id) {
    Optional<ClienteDto> clienteDto = clienteRepository.findById(id);

    return clienteDto.map(clienteMapper::toClienteEntity).orElse(null);
  }

  @Override
  public List<Cliente> getAll() {
    List<ClienteDto> clientes = clienteRepository.findAll();

    return clientes.stream().map(clienteMapper::toClienteEntity).toList();
  }
}
