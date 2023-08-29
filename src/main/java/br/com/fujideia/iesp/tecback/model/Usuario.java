package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/* -PRIMEIRO PASSO-
Mapeamento da classe java para o banco de dados  */

@Getter
@Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue

    private Integer id;

    private String nome;

    private String email;

    private String cpf;

}
