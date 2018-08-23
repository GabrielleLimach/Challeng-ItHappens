CREATE TABLE produtos(
  idproduto serial NOT NULL,
  nome varchar (20),
  qtd int,
)
CREATE TABLE filial(
 idfilial BIGSERIAL NOT NULL,
 nome VARCHAR (20),
 fk_estoque BIGSERIAL
 fk_produto Big

)
CREATE TABLE estoque(
 idestoque BIGSERIAL NOT NULL,
 quantidade int
)

CREATE TABLE pedidoestoque(
  idpedido BIGSERIAL PRIMARY KEY NOT NULL,
  fk_produto BIGSERIAL NOT NULL,


)

CREATE TABLE itempedidoestoque(


)