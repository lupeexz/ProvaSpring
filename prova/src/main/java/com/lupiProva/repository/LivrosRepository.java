package com.lupiProva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lupiProva.Entity.Autor;
import com.lupiProva.Entity.Livros;

public interface LivrosRepository extends JpaRepository<Livros, Long> {
	@Query(value = "SELECT * FROM Livros 1 WHERE lower(1.titulo) LIKE %:titulo%", nativeQuery = true)
	List<Livros> buscarPorTitulo(@Param("titulo")String titulo);
}
