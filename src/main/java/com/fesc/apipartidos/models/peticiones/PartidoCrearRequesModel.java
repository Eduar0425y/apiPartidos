package com.fesc.apipartidos.models.peticiones;

import java.util.Date;

public class PartidoCrearRequesModel {
    
    private Date fecha;
    private String equipoLocal;
    private String equipoVisitante;

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEquipoLocal() {
        return this.equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return this.equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

}
