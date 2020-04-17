package br.com.casadanca.domain;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Stateless
public class UsuarioRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Usuario getUsuario(String email, String senha) {
		
		try {
			
			Usuario usuario = (Usuario) em.createQuery("SELECT u from Usuario u where u.email = :email and u.senha = :senha")
					.setParameter("email", email)
					.setParameter("senha", senha).getSingleResult();
			
			return usuario;
			
			
		}catch(NoResultException e) {
			return null;
		}
		
	}
	
	
}
