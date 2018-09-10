package com.appstude.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appstude.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
