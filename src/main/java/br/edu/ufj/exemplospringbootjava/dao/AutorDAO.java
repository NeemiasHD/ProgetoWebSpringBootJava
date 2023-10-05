
package br.edu.ufj.exemplospringbootjava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufj.exemplospringbootjava.model.Autor;

public interface AutorDAO extends JpaRepository<Autor, Integer> {

}