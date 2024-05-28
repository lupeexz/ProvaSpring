package com.lupiProva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lupiProva.Entity.Categoria;

public interface CategoriarRepository extends JpaRepository<Categoria, Long>{
}
