package com.ger.springbootmicoservice1inmueble.services;

import com.ger.springbootmicoservice1inmueble.models.Property;

import java.util.List;

public interface PropertyService {
    Property saveProperty(Property property);

    void deleteProperty(Long id);

    List<Property> findAllProperties();
}
