package com.lupiProva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lupiProva.Entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
