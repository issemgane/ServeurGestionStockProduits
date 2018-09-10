package com.appstude.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appstude.entities.Produit;
import com.appstude.service.IProduitService;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class Produitcontroller {
	
	@Autowired
	private IProduitService  iProduitService;
	

	@GetMapping("/produits")
	public List<Produit> getProduit() {
		return iProduitService.getProduit();
	}


	@PostMapping("/produits")
	public void addProduit(@RequestBody Produit produit) {
		iProduitService.addProduit(produit);
		
	}


	@DeleteMapping("/produits/{id}")
	public void deleteProduit(@PathVariable("id") Long id) {
		iProduitService.deleteProduit(id);
		
	}

	@PutMapping("/produits")
	public void updateProduit(@RequestBody Produit produit) {
		iProduitService.updateProduit(produit);
	}


}
