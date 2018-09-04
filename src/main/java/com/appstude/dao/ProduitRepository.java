package com.appstude.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appstude.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
