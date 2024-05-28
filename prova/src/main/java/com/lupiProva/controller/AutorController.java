package com.lupiProva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lupiProva.Entity.Autor;
import com.lupiProva.Services.AutorService;

@RestController
@RequestMapping("/Autor")
public class AutorController {
	private final AutorService autorService;

    @Autowired
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public Autor createProduct(@RequestBody Autor autor) {
        return autorService.saveProduto(autor);
    }

    @GetMapping("/{id}")
    public Autor getProduto(@PathVariable Long id) {
        return autorService.getLivroById(id);
    }

    @GetMapping
    public List<Autor> getAllAutor() {
        return autorService.getAllAutor();
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
    	autorService.deleteAutor(id);
    }
}

