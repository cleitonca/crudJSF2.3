package br.com.casadanca.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone implements Serializable {

	@Column(name = "DDD_CELULA", nullable = false)
	private Integer dddCelular;
	
	@Column(name = "CELULAR", nullable = false)
	private Integer celular;
	
	@Column(name = "DDD_FIXO", nullable = true)
	private Integer dddFixo;
	
	@Column(name = "FIXO", nullable = true)
	private Integer fixo;

	public Integer getDddCelular() {
		return dddCelular;
	}

	public void setDddCelular(Integer dddCelular) {
		this.dddCelular = dddCelular;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public Integer getDddFixo() {
		return dddFixo;
	}

	public void setDddFixo(Integer dddFixo) {
		this.dddFixo = dddFixo;
	}

	public Integer getFixo() {
		return fixo;
	}

	public void setFixo(Integer fixo) {
		this.fixo = fixo;
	}
	
	
	
	
}
