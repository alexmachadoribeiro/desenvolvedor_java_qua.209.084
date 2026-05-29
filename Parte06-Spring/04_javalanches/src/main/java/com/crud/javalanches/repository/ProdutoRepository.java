package com.crud.javalanches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.javalanches.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
