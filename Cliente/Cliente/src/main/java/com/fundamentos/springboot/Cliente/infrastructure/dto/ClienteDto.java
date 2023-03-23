package com.fundamentos.springboot.Cliente.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Data
@Entity
public class ClienteDto {

  @Id
  private String id;
  private String typeid;
  private String name;
  private String lastname;
  private  boolean estado;

}
