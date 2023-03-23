package com.fundamentos.springboot.Cliente.infrastructure.mapper;

import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import com.fundamentos.springboot.Cliente.infrastructure.dto.ClienteDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClienteMapper {

  Cliente toClienteEntity(ClienteDto ClienteDto);
  ClienteDto toClienteDto(Cliente cliente);

}
