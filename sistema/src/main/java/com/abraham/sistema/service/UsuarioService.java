package com.abraham.sistema.service;

import java.util.List;

import com.abraham.sistema.model.Usuario;

public interface UsuarioService {
    public Usuario findById(Long id);

    public Usuario findByName(String nombreu);

    public List<Usuario> findAllOrderedByName();

    public void register(Usuario usuario);
}