ALTER TABLE public.funcionario
ADD CONSTRAINT fk_setor
FOREIGN KEY (fk_setor) REFERENCES public.setor (idsetor);

ALTER TABLE public.estoque
ADD CONSTRAINT fk_produtos
FOREIGN KEY fk_produtos references public.produto (idproduto)