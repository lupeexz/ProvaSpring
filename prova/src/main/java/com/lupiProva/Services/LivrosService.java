package com.lupiProva.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lupiProva.Entity.Autor;
import com.lupiProva.Entity.Livros;
import com.lupiProva.repository.LivrosRepository;

@Service
public class LivrosService {
	@Autowired
	private final LivrosRepository livrosRepository;

	@Autowired
	public LivrosService(LivrosRepository livrosRepository) {
		this.livrosRepository = livrosRepository;
	}

	public Livros saveProduto(Livros livros) {
		return livrosRepository.save(livros);
	}

	public Livros getLivroById(Long id) {
		return livrosRepository.findById(id).orElse(null);
	}

	public List<Livros> getAllLivro() {
		return livrosRepository.findAll();
	}

	public void deleteLivro(Long id) {
		livrosRepository.deleteById(id);
	}
	
	public List<Livros> buscarPorTitulo(String titulo){
		return livrosRepository.buscarPorTitulo(titulo);
	}

}
