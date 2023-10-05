
package br.edu.ufj.exemplospringbootjava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufj.exemplospringbootjava.model.Livro;

public interface LivroDAO extends JpaRepository<Livro, Integer> {

}