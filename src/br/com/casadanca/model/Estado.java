package br.com.casadanca.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADO")
public class Estado implements Serializable{

	
	private Long id;
	
	
	private String Sigla;
	
	
	private String nome;
	
	
	
	
}
