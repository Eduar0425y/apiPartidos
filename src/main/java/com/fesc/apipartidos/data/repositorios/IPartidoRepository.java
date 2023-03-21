package com.fesc.apipartidos.data.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.fesc.apipartidos.data.entidades.PartidoEntity;


public interface IPartidoRepository extends PagingAndSortingRepository<PartidoEntity, Long>{
    
    

}
