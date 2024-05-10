package com.jota.sanfelipe.controllers;

import com.jota.sanfelipe.entities.Client;
import com.jota.sanfelipe.entities.Washed;
import com.jota.sanfelipe.services.ClientService;
import com.jota.sanfelipe.services.WashedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/washed")
public class WashedController {
    @Autowired
    private WashedService washedService;

    @GetMapping
    public List<Washed> findAll() {
        return washedService.getAllWasheds();
    }


    @PostMapping("register")
    public ResponseEntity<Washed> registerWashed(@RequestBody Washed washed){
        Washed savedWashed = washedService.registerWashed(washed);
        return new ResponseEntity<>(savedWashed, HttpStatus.CREATED);
    }
}

