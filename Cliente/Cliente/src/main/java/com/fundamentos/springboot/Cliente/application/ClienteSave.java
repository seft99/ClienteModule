package com.fundamentos.springboot.Cliente.application;

import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import com.fundamentos.springboot.Cliente.domain.service.ClienteGetService;
import com.fundamentos.springboot.Cliente.domain.service.ClienteSaveService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@Slf4j
public class ClienteSave {

  private final ClienteSaveService clienteSaveService;

  private final ClienteGetService clienteGetService;

  public Cliente saveCliente(Cliente cliente){
   Cliente existCliente = clienteGetService.get(cliente.getId());
       if(existCliente != null){
         log.warn("Ya existe un cliente con este ID");
         return null;
       }
    return clienteSaveService.saveCliente(cliente);
  }

}
