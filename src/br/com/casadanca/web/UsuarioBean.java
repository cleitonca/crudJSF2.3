package br.com.casadanca.web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.casadanca.domain.Usuario;
import br.com.casadanca.service.UsuarioService;

@Named
public class UsuarioBean implements Serializable {

	@EJB
	private UsuarioService usuarioService;
	
	private Usuario usuario = new Usuario();

	
	public String envia() {
		
		usuario = usuarioService.getUsuario(usuario.getEmail(), usuario.getSenha());
		
		if (usuario == null) {
			
			usuario = new Usuario();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Cadastro não encontrado na nossa base de dados!","Erro no Login!"));
			
			return null;
			
		} else {
			
			return "/index";
		}
		
		
	}
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
