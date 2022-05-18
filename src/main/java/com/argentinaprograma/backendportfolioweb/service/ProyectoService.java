/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Proyecto;
import com.argentinaprograma.backendportfolioweb.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    private ProyectoRepository repository;

    @Override
    public List<Proyecto> obtenerProyecto() {
        return repository.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        repository.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Proyecto obtenerProyecto(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proyecto) {
        repository.save(proyecto);
    }
    
}
