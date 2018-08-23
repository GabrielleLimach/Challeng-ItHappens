CREATE TABLE produtos(
  Id serial NOT NULL,
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
 quantidade int,


)