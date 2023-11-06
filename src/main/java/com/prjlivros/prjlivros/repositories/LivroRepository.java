package com.prjlivros.prjlivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjlivros.prjlivros.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
