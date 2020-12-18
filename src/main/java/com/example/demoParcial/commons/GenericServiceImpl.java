package com.example.demoParcial.commons;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public abstract class GenericServiceImpl<T,ID extends Serializable> implements GenericServiceAPI<T,ID>{
	
	@Override
	public T save(T entiity){
		return getDao().save(entity);
	}
	
	@Override
	public void delete(ID id){
		getDao().deleteBy(id);
	}
	
	@Override
	public T get(ID id){
		Optional<T> obj = getDao().findById(id);
		if(obj.isPresent()){
			return obj.get();
		}
	}
	
	@Override
	public List<T> getAll(){
		List<T> returnList=new ArrayList<>();
		getDao().findAll().forEach(obj -> returnList.add(obj));
		return returnList;
	}
	
	public abstract CrudReposity<T,ID> getDao();
	
}
