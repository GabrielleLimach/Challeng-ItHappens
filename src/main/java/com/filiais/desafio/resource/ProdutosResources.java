package com.filiais.desafio.resource;

import com.filiais.desafio.models.Produtos;
import com.filiais.desafio.repository.ProdutosRepository;

import java.util.List;

public class ProdutosResources {

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class CargoResource {

    @Autowired
    private ProdutosRepository produtosRepository;


    @GetMapping
    private List<Produtos> listar() {
        return produtosRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private ResponseEntity<Produtos> criar(@Valid @RequestBody Produtos produto, HttpServletResponse response) {
        Produtos produtoSalvo = produtosRepository.save(produto);


        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);

    }
}
