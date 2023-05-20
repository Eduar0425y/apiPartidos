package com.fesc.apipartidos.data.repositorios;

import com.fesc.apipartidos.data.entidades.UsuarioEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.fesc.apipartidos.data.entidades.PartidoEntity;

import java.util.List;


public interface IPartidoRepository extends PagingAndSortingRepository<PartidoEntity, Long>{
    
    public List<PartidoEntity> findByUsuarioEntityOrderByCreadoDesc(UsuarioEntity usuarioEntity);

    @Query(nativeQuery = true, value = "SELECT * FROM partido ORDER BY creado DESC LIMIT 10")
    public List<PartidoEntity> partidosCreados();

    public PartidoEntity findByIdPartido(String id);

}
