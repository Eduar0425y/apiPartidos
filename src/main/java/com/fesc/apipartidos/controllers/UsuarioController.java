package com.fesc.apipartidos.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesc.apipartidos.models.peticiones.UsuarioCrearRequestModel;
import com.fesc.apipartidos.models.respuestas.UsuarioDataRestModel;
import com.fesc.apipartidos.services.IUsuarioService;
import com.fesc.apipartidos.shared.UsuarioDto;


@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioService iUsuarioService;

    @GetMapping
    public UsuarioDataRestModel leerUsuario(){

        String username= "rortegani";

        UsuarioDto usuarioDto = iUsuarioService.leerUsuario(username);

        UsuarioDataRestModel usuarioDataRestModel= modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

        return usuarioDataRestModel;

    }

    @PostMapping
    public UsuarioDataRestModel crearUsuario(@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel){
        
        
        UsuarioDto usuarioCrearDto = modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);
        
        UsuarioDto usuarioDto= iUsuarioService.crearUsuario(usuarioCrearDto);

        UsuarioDataRestModel usuarioDataRestModel= modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

        return usuarioDataRestModel;
    }

}
