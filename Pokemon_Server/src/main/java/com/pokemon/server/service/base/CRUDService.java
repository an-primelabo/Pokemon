package com.pokemon.server.service.base;

import java.io.Serializable;
import java.util.List;

public interface CRUDService<E> {
	E findById(Serializable id);

	List<E> getAll();

	E save(E entity);

	void delete(Serializable id);

	boolean isExists(E entity);
}