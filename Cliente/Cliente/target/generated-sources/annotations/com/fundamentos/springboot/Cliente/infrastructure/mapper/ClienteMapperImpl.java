package com.fundamentos.springboot.Cliente.infrastructure.mapper;

import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import com.fundamentos.springboot.Cliente.infrastructure.dto.ClienteDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-23T02:53:07-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public Cliente toClienteEntity(ClienteDto ClienteDto) {
        if ( ClienteDto == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        return cliente;
    }

    @Override
    public ClienteDto toClienteDto(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDto clienteDto = new ClienteDto();

        return clienteDto;
    }
}
