package net.yukitteru.easywms.util.converter;

import net.yukitteru.easywms.entity.Brand;

import java.beans.PropertyEditorSupport;

public class StringToBrandConverter extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(Brand.byName(text));
    }
}
