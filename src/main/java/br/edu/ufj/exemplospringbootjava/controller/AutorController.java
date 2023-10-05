package br.edu.ufj.exemplospringbootjava.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.ufj.exemplospringbootjava.dao.AutorDAO;
import br.edu.ufj.exemplospringbootjava.model.Autor;

@RestController
@RequestMapping("/biblioteca/autor")
public class AutorController {

    @Autowired
    private AutorDAO dao;

    @GetMapping("/listar/{id}")
    public Optional<Autor> buscarUm(@PathVariable int id) {
        return dao.findById(id);
    }

    @GetMapping("/listar")
    public List<Autor> buscarTodos() {
        return dao.findAll();
    }

    @PostMapping("/gravar")
    public Autor gravar(@RequestBody Autor obj) {
        return dao.save(obj);
    }

    @PutMapping("/alterar/{id}")
    public Autor alterar(@PathVariable int id, @RequestBody Autor obj) {
        obj.setCodigo(id);
        return dao.save(obj);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable int id) {
        dao.deleteById(id);

    }

}
