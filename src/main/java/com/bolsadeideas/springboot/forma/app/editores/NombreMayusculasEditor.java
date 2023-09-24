package com.bolsadeideas.springboot.forma.app.editores;

import java.beans.PropertyEditorSupport;

public class NombreMayusculasEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text)throws IllegalArgumentException{
        setValue(text.toUpperCase().trim());
    }
}
