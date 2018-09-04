package com.appstude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.appstude.dao.ProduitRepository;
import com.appstude.entities.Produit;


@Service
@Primary
public class ProduitService implements IProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	@Override
	public List<Produit> getProduit() {
	
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		produitRepository.save(produit);
		
	}

	@Override
	public void deleteProduit(Long id ) {
		produitRepository.delete(id);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produitRepository.save(produit);
		
	}

}
