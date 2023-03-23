package com.fundamentos.springboot.Cliente.infrastructure.repository;

import com.fundamentos.springboot.Cliente.infrastructure.dto.ClienteDto;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


  @Repository
  public interface ClienteRepository extends JpaRepository<ClienteDto, String> {

    @Query(nativeQuery = true, value = "update cliente_dto set name = :name, lastname = :lastname where id = :id")
    @Modifying
    void updateCliente(@Param("id") String id,
                      @Param("name") String name,
                      @Param("lastname") String lastname);

    @Query(nativeQuery = true, value = "update cliente_dto set estado = :estado where id = :id")
    @Modifying
    void updateStateCliente(@Param("id") String id, @Param("estado") Boolean estado);
  }