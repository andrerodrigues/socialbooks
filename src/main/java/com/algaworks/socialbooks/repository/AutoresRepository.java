package com.algaworks.socialbooks.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor,Long> {

}
