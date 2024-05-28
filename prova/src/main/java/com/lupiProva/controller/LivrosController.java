package com.lupiProva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lupiProva.Entity.Autor;
import com.lupiProva.Entity.Livros;
import com.lupiProva.Services.LivrosService;


@RestController
@RequestMapping("/Livros")
@CrossOrigin(origins = "https://localhost:8080")
public class LivrosController {
	private final LivrosService livrosService;

	    @Autowired
	    public LivrosController(LivrosService livrosService) {
	        this.livrosService = livrosService;
	    }

	    @PostMapping
	    public Livros createProduct(@RequestBody Livros livros) {
	        return livrosService.saveProduto(livros);
	    }

	    @GetMapping("/{id}")
	    public Livros getProduto(@PathVariable Long id) {
	        return livrosService.getLivroById(id);
	    }

	    @GetMapping
	    public List<Livros> getAllLivros() {
	        return livrosService.getAllLivro();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProduto(@PathVariable Long id) {
	    	livrosService.deleteLivro(id);
	    }
	    
	    @GetMapping("/titulo/{titulo}")
	    public List<Livros> buscarPorTitulo(@PathVariable String titulo){
	    	return livrosService.buscarPorTitulo(titulo);
	    }
	}
