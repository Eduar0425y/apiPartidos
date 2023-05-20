package com.fesc.apipartidos.services;

import com.fesc.apipartidos.models.peticiones.PartidoActualizarRequestModel;
import com.fesc.apipartidos.shared.PartidoDto;

import java.util.List;

public interface IPartidoService {
    
    public PartidoDto crearPartido(PartidoDto partidoCrearDto);

    public List<PartidoDto> partidosCreados();

    public PartidoDto detallePartido(String id);

    public PartidoDto actualizarPartido(String idPartido, PartidoDto partidoActualizarDto);

    void eliminarPartido(String idPartido, long idUsuario);
}
