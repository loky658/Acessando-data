package com.example.accessingdata;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    
    public Usuario findById(int id);
}
