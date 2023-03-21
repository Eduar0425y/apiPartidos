package com.fesc.apipartidos.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EquipoDto implements Serializable{
    
    private static final long serialVersionUID= 1L;

    private long id;
    private String nombre;
    private List<PartidoDto> partidoDtoLocalList =new ArrayList<>();
    private List<PartidoDto> partidoDtoVisitanteList =new ArrayList<>();


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PartidoDto> getPartidoDtoLocalList() {
        return this.partidoDtoLocalList;
    }

    public void setPartidoDtoLocalList(List<PartidoDto> partidoDtoLocalList) {
        this.partidoDtoLocalList = partidoDtoLocalList;
    }

    public List<PartidoDto> getPartidoDtoVisitanteList() {
        return this.partidoDtoVisitanteList;
    }

    public void setPartidoDtoVisitanteList(List<PartidoDto> partidoDtoVisitanteList) {
        this.partidoDtoVisitanteList = partidoDtoVisitanteList;
    }

}
