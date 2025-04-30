package com.example.api_totem_bus.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_totem_bus.service.totemBusService;



@RestController
public class totemBusController {

    totemBusService totemBus = new totemBusService();


    @GetMapping("/prevParada/{id}")
    public String prevParada(@PathVariable int id){
        return totemBus.prevParada(id);
    }

    @GetMapping("/coordIti/{id}")
    public String coordIti(@PathVariable int id){
        return totemBus.coordIti(id);
    }

    @GetMapping("/coordVei/{id}")
    public String coordVei(@PathVariable int id){
        return totemBus.coordVei(id);
    }

}

