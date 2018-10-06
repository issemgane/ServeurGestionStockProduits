package com.appstude.controllers;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appstude.entities.Produit;



@RestController
@RequestMapping(value="/api/produits/crud")
@CrossOrigin
public class Produitcontroller extends CrudController<Produit,Long>  {
	
}
