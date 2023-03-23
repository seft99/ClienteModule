package com.fundamentos.springboot.Cliente.infrastructure.api.controller;


import com.fundamentos.springboot.Cliente.application.ClienteGet;
import com.fundamentos.springboot.Cliente.application.ClienteSave;
import com.fundamentos.springboot.Cliente.application.ClienteUpdate;
import com.fundamentos.springboot.Cliente.domain.entities.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
    private final ClienteUpdate clienteUpdate;
    private final ClienteSave clienteSave;
    private final ClienteGet clienteGet;

    @PostMapping()
    public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteSave.saveCliente(cliente), HttpStatus.CREATED);
    }
    @PutMapping(value = "/update")
    public void updateCliente(@RequestBody Cliente cliente){
       clienteUpdate.updateCliente(cliente);
    }
    @GetMapping
    public ResponseEntity<Cliente> getCliente(@RequestParam String id){
        return ResponseEntity.ok(clienteGet.get(id));
    }
    @GetMapping(value = "/searchAll")
    public ResponseEntity<List<Cliente>> getListClientes(){
        return ResponseEntity.ok(clienteGet.getAll());
    }

}
