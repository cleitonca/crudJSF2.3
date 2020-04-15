package br.com.casadanca.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable{
	
	private enum Situacao{
		
		Ativo, Inativo, Bloqueado;
	}

	@Id
    @Column(name="ID", nullable=false, unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column(name="NOME", nullable=false, unique=true)
	private String nome;
	
	@Column(name = "EMAIL", nullable = false, unique=true)
	private String email;
	
	@Column(name = "SENHA", nullable = false)
	private String senha;
	
	@Column(name="ULTIMO_ACESSO", unique=true)
    @Temporal(TemporalType.TIMESTAMP)
	private Date ultimoAcesso;
	
	@Enumerated
	@Column(name = "SITUACAO", nullable = false)
	private Situacao situacao;
	
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}

	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
	
	
	
	
	
}
