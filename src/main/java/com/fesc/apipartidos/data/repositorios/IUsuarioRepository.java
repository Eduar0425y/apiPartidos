package com.fesc.apipartidos.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import com.fesc.apipartidos.data.entidades.UsuarioEntity;
import org.springframework.stereotype.Repository;

public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Long> {
    
   public UsuarioEntity findByEmail(String email);
   public UsuarioEntity findByUsername(String username);
   


}
