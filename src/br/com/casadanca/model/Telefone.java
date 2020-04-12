package br.com.casadanca.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Telefone implements Serializable {

	
	private Integer dddCelular;
	
	private Integer celular;
	
	private Integer dddFixo;
	
	private Integer fixo;
	
	
	
}
