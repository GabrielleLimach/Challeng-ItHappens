package com.filiais.desafio.models;

@Entity
@Table(name = "estoque")
public class Estoque {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idestoque;

    @JoinColumn(name = "fk_produtos")
    @ManyToOne // um estoque possui n produtos
    private Produtos fkproduto;


}
