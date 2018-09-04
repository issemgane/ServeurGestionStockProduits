package com.appstude.service;

import java.util.List;

import com.appstude.entities.Produit;

public interface IProduitService {

	public List<Produit> getProduit();
	public void addProduit(Produit produit);
	public void deleteProduit(Long id);
	public void updateProduit(Produit produit);
}
