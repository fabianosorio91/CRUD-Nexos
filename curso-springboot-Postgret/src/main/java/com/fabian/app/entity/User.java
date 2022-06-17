package com.fabian.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/* paquete de Entity. */
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity //le dice a Spring que esta clase es una Entidad
@Table(name = "users") //va a crear una tabla con el nombre Users
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class User implements Serializable{ //permite convertir cualquier objeto cuya clase 
	//implemente el interface Serializable en una secuencia de bytes que pueden ser posteriormente 
	//leídos para restaurar el objeto original.
	
	//definimos los atributos de la clase
	private static final long serialVersionUID = -1242949365035046753L; 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //aqui se genera el identificador y que use la estrategia
	@Column(name = "id", unique = true, nullable = false)
	//GenerationTypo
	private Long id;
	@Column(length = 50) //longitud de 50
	private String name; //atributo
	private String surname;
	@Column(name="mail" , nullable=false,length = 50, unique =true)  //se va a llamar mail, no puede ser nulo. tiene longitud de 50, y debe ser unica
	private String email;
	private boolean enabled; //"boolean "para saber si esta habilitado
	public Long getId() {
		return id;
	}
	
	//se crean los metodos setters y getters...automatico
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	

}
