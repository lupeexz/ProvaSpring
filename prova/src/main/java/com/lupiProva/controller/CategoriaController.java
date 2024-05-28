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

import com.lupiProva.Entity.Categoria;
import com.lupiProva.Services.CategoriaService;

@RestController
@RequestMapping("/Categoria")
public class CategoriaController {
	private final CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria createProduct(@RequestBody Categoria categoria) {
        return categoriaService.saveProduto(categoria);
    }

    @GetMapping("/{id}")
    public Categoria getProduto(@PathVariable Long id) {
        return categoriaService.getLivroById(id);
    }

    @GetMapping
    public List<Categoria> getAllcategoria() {
        return categoriaService.getAllCategoria();
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
    	categoriaService.deleteCategoria(id);
    }
}
