package com.jota.sanfelipe.repository;

import com.jota.sanfelipe.entities.Washed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WashedRepository extends JpaRepository<Washed, Long> {
    Optional<Washed> findById(Long id);
}
