package com.ger.springbootmicoservice1inmueble.controllers;

import com.ger.springbootmicoservice1inmueble.models.Property;
import com.ger.springbootmicoservice1inmueble.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/property")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @PostMapping
    public ResponseEntity<?> saveProperty(@RequestBody Property property) {
        return new ResponseEntity<>(propertyService.saveProperty(property), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProperties() {
        return new ResponseEntity<>(propertyService.findAllProperties(), HttpStatus.OK);
    }
}
