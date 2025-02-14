package com.ger.springbootmicoservice1inmueble.repositories;

import com.ger.springbootmicoservice1inmueble.models.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {}
