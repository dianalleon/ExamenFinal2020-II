package com.example.demoParcial.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Numero {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private Integer boleta;
	
	@Column
	private Integer numero;
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id=id;
	}
	
	public Integer getBoleta(){
		return boleta;
	}
	
	public void setBoletas(Integer Boleta){
		this.boleta=boleta;
	}
	
	public Integer getNumero(){
		return numero;
	}
	
	public void setNumero(Integer Numero){
		this.numero=numero;
	}

}
