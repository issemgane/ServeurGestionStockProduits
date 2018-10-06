package com.appstude.service;

import java.util.List;

import org.springframework.stereotype.Repository;



public interface ICrudService <T,ID> {

	public List<T> getAll();
	public void add(T entity);
	public void delete(ID id);
	public void update(T entity);
}
