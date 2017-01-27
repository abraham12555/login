package com.abraham.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abraham.sistema.data.UsuarioDao;
import com.abraham.sistema.model.Usuario;
@Service
public class UsuarioServiceImpl implements UsuarioService {
 
	@Autowired
	private UsuarioDao usuarioDao;

	@Transactional
	public void register(Usuario usuario) {
		usuarioDao.register(usuario);
	}

	@Transactional
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Usuario findByName(String nombreu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Usuario> findAllOrderedByName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
