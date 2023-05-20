package com.fesc.apipartidos.services;

import com.fesc.apipartidos.shared.PartidoDto;
import com.fesc.apipartidos.shared.UsuarioDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUsuarioService extends UserDetailsService {

    public UsuarioDto crearUsuario(UsuarioDto usuarioCrearDto);
    public UsuarioDto leerUsuario(String username);
    public List<PartidoDto> verMisPartidos(String username);

}
