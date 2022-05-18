/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.controller;

import com.argentinaprograma.backendportfolioweb.model.Proyecto;
import com.argentinaprograma.backendportfolioweb.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    public IProyectoService service;
    
    @GetMapping("/proyecto")
    @ResponseBody
    public List<Proyecto> obtenerProyecto(){
        return service.obtenerProyecto();
    }
    
    @PostMapping("/proyecto/create")
    public void crearProyecto(@RequestBody Proyecto proyecto){
        service.crearProyecto(proyecto);
    }
    
    @DeleteMapping("/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        service.borrarProyecto(id);
    }
    
    @GetMapping("/proyecto/{id}")
    @ResponseBody
    public Proyecto obtenerSkill(@PathVariable Long id){
        return service.obtenerProyecto(id);
    }
    
    @PutMapping("/proyecto/{id}/update")
    public void modificarProyecto (@RequestBody Proyecto proyecto){
        service.modificarProyecto(proyecto);
    }
    
}
