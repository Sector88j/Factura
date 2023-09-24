package com.bolsadeideas.springboot.forma.app.editores;

import com.bolsadeideas.springboot.forma.app.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class RolesEditor extends PropertyEditorSupport {
    @Autowired
    private RoleService service;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            Integer id = Integer.parseInt(text);
            setValue(service.obtenerPorId(id));
        } catch(NumberFormatException e) {
            setValue(null);
        }
    }
}
