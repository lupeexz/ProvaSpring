package com.lupiProva.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lupiProva.Entity.Autor;
import com.lupiProva.repository.AutorRepository;

@Service
public class AutorService {
	@Autowired
	private final AutorRepository autorRepository;

	@Autowired
	public AutorService(AutorRepository autorRepository) {
		this.autorRepository = autorRepository;
	}

	public Autor saveProduto(Autor autor) {
		return autorRepository.save(autor);
	}

	public Autor getLivroById(Long id) {
		return autorRepository.findById(id).orElse(null);
	}

	public List<Autor> getAllAutor() {
		return autorRepository.findAll();
	}

	public void deleteAutor(Long id) {
		autorRepository.deleteById(id);
	}
}
