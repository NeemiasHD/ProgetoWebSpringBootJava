package br.edu.ufj.exemplospringbootjava.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.ufj.exemplospringbootjava.dao.LivroDAO;
import br.edu.ufj.exemplospringbootjava.model.Livro;

@RestController
@RequestMapping("/biblioteca/livros")
public class LivroController {

    @Autowired
    private LivroDAO dao;

    @GetMapping("/listar/{id}")

    public Optional<Livro> buscarUm(@PathVariable int id) {
        return dao.findById(id);
    }

    @GetMapping("/listar")
    public List<Livro> buscarTodos() {
        return dao.findAll();
    }

    @PostMapping("/gravar")
    public Livro gravar(@RequestBody Livro obj) {
        return dao.save(obj);
    }

    @PutMapping("/alterar/{id}")
    public Livro alterar(@PathVariable int id, @RequestBody Livro obj) {
        obj.setCodigo(id);
        return dao.save(obj);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable int id) {
        dao.deleteById(id);

    }

}
