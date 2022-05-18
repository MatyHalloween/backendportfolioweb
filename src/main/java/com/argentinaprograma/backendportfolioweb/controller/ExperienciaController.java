/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.controller;

import com.argentinaprograma.backendportfolioweb.model.Experiencia;
import com.argentinaprograma.backendportfolioweb.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author maty_
 */
@RestController
public class ExperienciaController {
    
    @Autowired
    public IExperienciaService service;
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencia> obtenerExperiencia(){
        return service.obtenerExperiencia();
    }
    
    @PostMapping("/experiencia/create")
    public void crearExperiencia(@RequestBody Experiencia experiencia){
        service.crearExperiencia(experiencia);
    }
    
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        service.borrarExperiencia(id);
    }
    
    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Experiencia obtenerExperiencia(@PathVariable Long id){
        return service.obtenerExperiencia(id);
    }
    
    @PutMapping("/experiencia/{id}/update")
    public void modificarExperiencia(@RequestBody Experiencia experiencia){
        service.modificarExperiencia(experiencia);
    }
            
}
