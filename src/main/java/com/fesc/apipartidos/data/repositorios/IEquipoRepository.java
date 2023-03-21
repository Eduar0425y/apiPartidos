package com.fesc.apipartidos.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import com.fesc.apipartidos.data.entidades.EquipoEntity;


public interface IEquipoRepository extends CrudRepository<EquipoEntity, Long>{
    
    EquipoEntity findById(long id);
}
