package br.edu.ufj.exemplospringbootjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ufj.exemplospringbootjava.dao.AutorDAO;
import br.edu.ufj.exemplospringbootjava.dao.LivroDAO;
import br.edu.ufj.exemplospringbootjava.model.Autor;
import br.edu.ufj.exemplospringbootjava.model.Livro;

@SpringBootApplication
public class ExemplospringbootjavaApplication implements CommandLineRunner {
	@Autowired
	private LivroDAO livroDAO;
	@Autowired
	private AutorDAO autorDAO;

	public static void main(String[] args) {
		SpringApplication.run(ExemplospringbootjavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Autor a1 = new Autor(1, "Neemias");
		Autor a2 = new Autor(2, "Gustavo");

		autorDAO.save(a1);
		autorDAO.save(a2);

		Livro l1 = new Livro(1, "Republicas de Narnia", a1);
		Livro l2 = new Livro(2, "Minecraft Em busca da casa automatica LIVRO", a2);

		livroDAO.save(l1);
		livroDAO.save(l2);

	}
}
