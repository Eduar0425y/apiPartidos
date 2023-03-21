package com.fesc.apipartidos.services;

import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fesc.apipartidos.data.entidades.EquipoEntity;
import com.fesc.apipartidos.data.entidades.PartidoEntity;
import com.fesc.apipartidos.data.entidades.UsuarioEntity;
import com.fesc.apipartidos.data.repositorios.IEquipoRepository;
import com.fesc.apipartidos.data.repositorios.IPartidoRepository;
import com.fesc.apipartidos.data.repositorios.IUsuarioRepository;
import com.fesc.apipartidos.shared.PartidoDto;

@Service
public class PartidoService implements IPartidoService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioRepository iUsuarioRepository;

    @Autowired
    IEquipoRepository iEquipoRepository;

    @Autowired
    IPartidoRepository iPartidoRepository;

    @Override
    public PartidoDto crearPartido(PartidoDto partidoCrearDto) {

        UsuarioEntity usuarioEntity= iUsuarioRepository.findByUsername(partidoCrearDto.getUsername());
        
        EquipoEntity equipoEntityLocal= iEquipoRepository.findById(partidoCrearDto.getEquipoLocal());
        
        EquipoEntity equipoEntityVisitante= iEquipoRepository.findById(partidoCrearDto.getEquipoVisitante());


        PartidoEntity partidoEntity = new PartidoEntity();
        partidoEntity.setIdPartido(UUID.randomUUID().toString());
        partidoEntity.setFecha(partidoCrearDto.getFecha());
        partidoEntity.setGolesLocal("0");
        partidoEntity.setGolesVisitante("0");
        partidoEntity.setUsuarioEntity(usuarioEntity);
        partidoEntity.setEquipoEntityLocal(equipoEntityLocal);
        partidoEntity.setEquipoEntityVisitante(equipoEntityVisitante);

        
        PartidoEntity partidoEntityCreado= iPartidoRepository.save(partidoEntity);

        PartidoDto partidoDto= modelMapper.map(partidoEntityCreado, PartidoDto.class);
        
        return partidoDto;
    }
    
}
