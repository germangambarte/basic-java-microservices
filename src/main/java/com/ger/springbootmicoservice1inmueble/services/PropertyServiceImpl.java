package com.ger.springbootmicoservice1inmueble.services;

import com.ger.springbootmicoservice1inmueble.models.Property;
import com.ger.springbootmicoservice1inmueble.repositories.PropertyRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {
    private final PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public Property saveProperty(Property property) {
        property.setCreated_at(LocalDateTime.now());
        return propertyRepository.save(property);
    }

    @Override
    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }

    @Override
    public List<Property> findAllProperties() {
        return propertyRepository.findAll();
    }
}
