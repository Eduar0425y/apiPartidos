package com.fesc.apipartidos.controllers;
import com.fesc.apipartidos.models.respuestas.PartidoDataRestModel;
import com.fesc.apipartidos.shared.PartidoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesc.apipartidos.models.peticiones.UsuarioCrearRequestModel;
import com.fesc.apipartidos.models.respuestas.UsuarioDataRestModel;
import com.fesc.apipartidos.services.IUsuarioService;
import com.fesc.apipartidos.shared.UsuarioDto;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioService iUsuarioService;

    @GetMapping
    public UsuarioDataRestModel leerUsuario(){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String username= authentication.getPrincipal().toString();

        UsuarioDto usuarioDto = iUsuarioService.leerUsuario(username);

        UsuarioDataRestModel usuarioDataRestModel= modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

        return usuarioDataRestModel;

    }

    @GetMapping("/misPartidos")
    public List<PartidoDataRestModel> leerMisPartidos(){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String username= authentication.getPrincipal().toString();

        List<PartidoDto> partidoDtoList = iUsuarioService.verMisPartidos(username);

        List<PartidoDataRestModel> partidoDataRestModelList = new ArrayList<>();

        for(PartidoDto partidoDto : partidoDtoList){

            PartidoDataRestModel partidoDataRestModel = modelMapper.map(partidoDto, PartidoDataRestModel.class);
            partidoDataRestModelList.add(partidoDataRestModel);

        }

        return partidoDataRestModelList;

    }

    @PostMapping
    public UsuarioDataRestModel crearUsuario(@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel){
        
        UsuarioDto usuarioCrearDto = modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);
        
        UsuarioDto usuarioDto= iUsuarioService.crearUsuario(usuarioCrearDto);

        UsuarioDataRestModel usuarioDataRestModel= modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

        return usuarioDataRestModel;
    }

}
