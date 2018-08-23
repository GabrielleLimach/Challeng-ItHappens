package com.filiais.desafio.resource;

import com.filiais.desafio.models.Produtos;
import com.filiais.desafio.repository.ProdutosRepository;

import java.util.List;

public class ProdutosResources {

@RestController
@RequestMapping("/produtos")
@CrossOrign("*")
public class CargoResource {

    //injecao de dependencia repository
    @Autowired
    private ProdutosRepository produtosRepository;


    //retornar uma lista de Produtos
    @GetMapping
    private List<Produtos> listar() {
        return produtosRepository.findAll();
    }

    //cadastra produtos
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private ResponseEntity<Produtos> criar(@Valid @RequestBody Produtos produto, HttpServletResponse response) {
        Produtos produtoSalvo = produtosRepository.save(produto);

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);

    }
}
