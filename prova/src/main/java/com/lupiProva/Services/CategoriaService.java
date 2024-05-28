package com.lupiProva.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lupiProva.Entity.Categoria;
import com.lupiProva.repository.CategoriarRepository;

@Service
public class CategoriaService {
	@Autowired
	private final CategoriarRepository categoriarRepository;

	@Autowired
	public CategoriaService(CategoriarRepository categoriarRepository) {
		this.categoriarRepository = categoriarRepository;
	}

	public Categoria saveProduto(Categoria categoria) {
		return categoriarRepository.save(categoria);
	}

	public Categoria getLivroById(Long id) {
		return categoriarRepository.findById(id).orElse(null);
	}

	public List<Categoria> getAllCategoria() {
		return categoriarRepository.findAll();
	}

	public void deleteCategoria(Long id) {
		categoriarRepository.deleteById(id);
	}
}

