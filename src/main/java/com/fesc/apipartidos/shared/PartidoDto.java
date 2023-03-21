package com.fesc.apipartidos.shared;

import java.io.Serializable;

import java.util.Date;

public class PartidoDto implements Serializable{

    private static final long serialVersionUID= 1L;
    
    private long id;
    private String idPartido;
    private String username;
    private Date fecha;
    private long equipoLocal;
    private long equipoVisitante;
    private String golesLocal;
    private String golesVisitante;
    private Date creado;
    private UsuarioDto usuarioEntity;
    private EquipoDto equipoEntityLocal;
    private EquipoDto equipoEntityVisitante;
    

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdPartido() {
        return this.idPartido;
    }

    public void setIdPartido(String idPartido) {
        this.idPartido = idPartido;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getEquipoLocal() {
        return this.equipoLocal;
    }

    public void setEquipoLocal(long equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public long getEquipoVisitante() {
        return this.equipoVisitante;
    }

    public void setEquipoVisitante(long equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getGolesLocal() {
        return this.golesLocal;
    }

    public void setGolesLocal(String golesLocal) {
        this.golesLocal = golesLocal;
    }

    public String getGolesVisitante() {
        return this.golesVisitante;
    }

    public void setGolesVisitante(String golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public Date getCreado() {
        return this.creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public UsuarioDto getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioDto usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public EquipoDto getEquipoEntityLocal() {
        return this.equipoEntityLocal;
    }

    public void setEquipoEntityLocal(EquipoDto equipoEntityLocal) {
        this.equipoEntityLocal = equipoEntityLocal;
    }

    public EquipoDto getEquipoEntityVisitante() {
        return this.equipoEntityVisitante;
    }

    public void setEquipoEntityVisitante(EquipoDto equipoEntityVisitante) {
        this.equipoEntityVisitante = equipoEntityVisitante;
    }

}
