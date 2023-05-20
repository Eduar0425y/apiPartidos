package com.fesc.apipartidos.models.peticiones;

public class PartidoActualizarRequestModel {

    private String golesLocal;
    private String golesVisitante;

    public String getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(String golesLocal) {
        this.golesLocal = golesLocal;
    }

    public String getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(String golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
}
