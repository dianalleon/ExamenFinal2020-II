package com.example.demoParcial.commons;

import java.util.List;
import java.io.Serializable;


public interface GenericServiceAPI <T,ID extends Serializable>{

	T save(T entiity); /*Se estan replazando por los valores de la clase Generic*/
	
	void delete(ID id);
	
	T get(ID id);
	
	List<T> getAll();
}
