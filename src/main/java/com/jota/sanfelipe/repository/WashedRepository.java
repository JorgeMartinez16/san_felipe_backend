package com.jota.sanfelipe.repository;

import com.jota.sanfelipe.entities.Washed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WashedRepository extends JpaRepository<Washed, Long> {
    List<Washed> findByName(String name);

}
