package br.com.casadanca.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALUNO")
public class Aluno implements Serializable {
	
	
	public enum Sexo {
		Masculino, Feminino;
	}
	
	
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String matricula;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "RG", nullable = false)
	private String rg;
	
	@Column(name = "CPF", nullable = false)
	private String cpf;
	
	@Column(name = "DATA_NASCIMENTO", nullable = false)
	private LocalDate dataNascimento;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Enumerated
	@Column(name = "SEXO", nullable = false)
	private Sexo sexo;
	
	@Embedded
	private Endereco endereco;
	
	@Embedded
	private Telefone telefone;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
	
}
