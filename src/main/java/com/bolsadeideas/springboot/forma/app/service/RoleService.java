package com.bolsadeideas.springboot.forma.app.service;

import com.bolsadeideas.springboot.forma.app.models.domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role> listar();
    public Role obtenerPorId(Integer id);
}
