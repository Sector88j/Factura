package com.bolsadeideas.springboot.forma.app.service;

import com.bolsadeideas.springboot.forma.app.models.domain.Pais;
import java.util.List;

public interface PaisService {
    public List<Pais> listar();
    public Pais obtenerPorId(Integer id);
}
