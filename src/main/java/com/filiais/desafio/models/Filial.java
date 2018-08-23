package com.filiais.desafio.models;


@Entity
@Table(name = filiais)
public class Filial {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idfilial;

    private String nome;

    private fk_estoque;
}
