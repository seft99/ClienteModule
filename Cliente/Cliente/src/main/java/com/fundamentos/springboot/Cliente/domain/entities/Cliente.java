package com.fundamentos.springboot.Cliente.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode
@Getter
@Builder
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Cliente {

  private String id;
  private String typeid;
  private String name;
  private String lastname;
  private boolean estado;

}
