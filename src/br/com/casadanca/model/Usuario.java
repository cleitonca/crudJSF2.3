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

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable{
	
	private enum Situacao{
		
		Ativo, Inativo, Bloqueado;
	}

	@Id
    @Column(name="ID", nullable=false, unique=true)
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
	
	
	//private PessoaFisica pessoaFisica;
	
	
	
}
