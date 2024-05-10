package com.jota.sanfelipe.services;

import com.jota.sanfelipe.entities.Washed;
import com.jota.sanfelipe.repository.WashedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WashedService {
    @Autowired
    private WashedRepository washedRepository;

    public Washed registerWashed(Washed washed){
        return washedRepository.save(washed);
    }

    public List<Washed> getAllWasheds(){
        return washedRepository.findAll();
    }
}
