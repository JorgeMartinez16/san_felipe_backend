package com.jota.sanfelipe.repository;

import com.jota.sanfelipe.entities.AvalaibleService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvalaibleServiceRepository extends JpaRepository<AvalaibleService, Long> {
    List<AvalaibleService> findByName (String name);
}
