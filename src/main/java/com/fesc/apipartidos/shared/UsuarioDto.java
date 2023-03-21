package com.fesc.apipartidos.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDto implements Serializable{
    
    private static final long serialVersionUID=1L;

    private long id;
    private String idUsuario;
    private String nombre;
    private String email;
    private String username;
    private String password;
    private String passwordEncriptada;
    private List<PartidoDto> partidoDtoList =new ArrayList<>();

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordEncriptada() {
        return this.passwordEncriptada;
    }

    public void setPasswordEncriptada(String passwordEncriptada) {
        this.passwordEncriptada = passwordEncriptada;
    }


    public List<PartidoDto> getPartidoDtoList() {
        return this.partidoDtoList;
    }

    public void setPartidoDtoList(List<PartidoDto> partidoDtoList) {
        this.partidoDtoList = partidoDtoList;
    }

}
