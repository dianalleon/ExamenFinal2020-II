package com.example.demoParcial.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Boleta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private Integer boleta;
		
	@Column
	private Integer sorteo;
	
	@Column
	private Integer persona;
	
	@Column
	private Date fecha;
	
	@Column
	private Boolean ganadora;
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id=id;
	}
	
	public Integer getBoleta(){
		return boleta;
	}
	
	public void setBoletas(Integer Boletas){
		this.boleta=boleta;
	}
	
	public Integer getSorteo(){
		return sorteo;
	}
	
	public void setSorteo(Integer Sorteo){
		this.sorteo=sorteo;
	}
	
	public Integer getPersona(){
		return persona;
	}
	
	public void setPersona(Integer Persona){
		this.persona=persona;
	}
	
	public Date getFecha(){
		return fecha;
	}
	
	public void setFecha(Date Fecha){
		this.fecha=fecha;
	}
	
	public Boolean getGanadora(){
		return ganadora;
	}
	
	public void setGanadora(Boolean Ganadora){
		this.ganadora=ganadora;
	}
}
