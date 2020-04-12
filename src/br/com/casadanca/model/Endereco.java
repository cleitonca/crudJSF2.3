package br.com.casadanca.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco implements Serializable{

	
	private Integer cep;
	
	
	private String logradouro;
	
	
	private Integer numero;
	
	
	private String complemento;
	
	
	private String bairro;
	
	
	private String cidade;
	
	
	private Estado estado;
	
	
}
