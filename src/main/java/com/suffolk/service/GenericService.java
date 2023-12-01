package com.suffolk.service;

import java.util.List;

public interface GenericService<T, ID> {
	
	public T getReferenceById(ID id);
	public List<T> findAll();
	public T save(T t);
	public void delete();

}
