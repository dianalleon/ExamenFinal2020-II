package com.example.demoParcial.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Sorteo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String nombre;
	
	@Column
	private Date fecha;
	
	@Column
	private Integer boletas;
	
	@Column
	private Integer numeros;
	
	@Column
	private Integer maximo;
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id=id;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public Date getFecha(){
		return fecha;
	}
	
	public void setFecha(Date Fecha){
		this.fecha=fecha;
	}
	
	public Integer getBoletas(){
		return boletas;
	}
	
	public void setBoletas(Integer Boletas){
		this.boletas=boletas;
	}
	
	public Integer getNumeros(){
		return numeros;
	}
	
	public void setNumeros(Integer Numeros){
		this.numeros=numeros;
	}
	
	public Integer getMaximo(){
		return maximo;
	}
	
	public void setMaximo(Integer Maximo){
		this.maximo=maximo;
	}
	
}