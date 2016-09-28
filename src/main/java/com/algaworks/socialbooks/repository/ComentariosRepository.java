package com.algaworks.socialbooks.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Serializable>{

}
