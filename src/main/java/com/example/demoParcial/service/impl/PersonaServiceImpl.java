package com.example.demoParcial.service.impl;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoParcial.commons.GenericServiceImpl;
import com.example.demoParcial.dao.api.PersonaDaoAPI;
import com.example.demoParcial.model.Persona;
import com.example.demoParcial.service.api.PersonaServiceAPI;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Integer>implements PersonaServiceAPI{
	
	@Autowirred
	private PersonaDaoAPI personaDaoAPI;
	
	@Override
	public CrudReposityPersona, Integer> getDao(){
		return personaDaoAPI;
	}
	
}
