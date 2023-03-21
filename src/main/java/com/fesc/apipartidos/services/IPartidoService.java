package com.fesc.apipartidos.services;

import com.fesc.apipartidos.shared.PartidoDto;

public interface IPartidoService {
    
    PartidoDto crearPartido(PartidoDto partidoCrearDto);
}
