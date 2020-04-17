package br.com.casadanca.service;

import javax.ejb.EJB;
import javax.persistence.NoResultException;

import br.com.casadanca.domain.Usuario;
import br.com.casadanca.domain.UsuarioRepository;

public class UsuarioService {

	@EJB
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario getUsuario(String email, String senha) {
		
		return usuarioRepository.getUsuario(email, senha);
		
		
	}
	
}
