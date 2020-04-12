package br.com.casadanca.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Aluno implements Serializable {

	
	public enum Sexo {
		Masculino, Feminino;
	}
	
	
	private Long Id;
	
	
	private String matricula;
	
	
	private String nome;
	
	
	private Integer rg;
	
	
	private String cpf;
	
	
	private LocalDate dataNascimento;
	
	
	private String email;
	
	
	private Sexo sexo;
	
	
	private Boolean ie_funcionario;
	
	
	private Endereco endereco;
	
	
	private Telefone telefone;
	
	
	
	
	
	
	
}
