package com.filiais.desafio.models;

@Entity
@Table(name = estoque)
public class Estoque {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idestoque;

}
