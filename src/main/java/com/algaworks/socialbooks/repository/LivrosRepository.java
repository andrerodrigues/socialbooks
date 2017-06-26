package com.algaworks.socialbooks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.algaworks.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro,Long>{
	
	@Query("SELECT p FROM Livro p WHERE LOWER(p.nome) like LOWER(?1)")
	List<Livro> findByNome(@Param("nome") String nome);
}
