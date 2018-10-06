package com.appstude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.appstude.dao.ProduitRepository;
import com.appstude.dao.UserRepository;
import com.appstude.entities.Produit;
import com.appstude.entities.User;


@Service
//@Primary
public class ProduitService implements ICrudService<Produit,Long> {

	@Autowired
	private ProduitRepository userRepository;

	@Override
	public List<Produit> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void add(Produit entity) {
		userRepository.save(entity);
		
	}

	@Override
	public void delete(Long id) {
		userRepository.delete(id);
	}

	@Override
	public void update(Produit entity) {
		userRepository.save(entity);
		
	}


}
