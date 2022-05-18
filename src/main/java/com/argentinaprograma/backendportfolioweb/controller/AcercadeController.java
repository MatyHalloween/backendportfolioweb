/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.controller;

import com.argentinaprograma.backendportfolioweb.model.Acercade;
import com.argentinaprograma.backendportfolioweb.service.IAcercadeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author maty_
 */
@RestController
public class AcercadeController {
    
    @Autowired
    public IAcercadeService service;
    
    @GetMapping("/acercade")
    @ResponseBody
    public List<Acercade> obtenerAcercade(){
        return service.obtenerAcercade();
    }

    @PutMapping("/acercade/update")
    public void modificarAcercade(@RequestBody Acercade acercade){
        service.modificarAcercade(acercade);
    
}
}