/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Experiencia;
import com.argentinaprograma.backendportfolioweb.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maty_
 */
@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    private ExperienciaRepository repository;

    @Override
    public List<Experiencia> obtenerExperiencia() {
        return repository.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
        repository.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Experiencia obtenerExperiencia(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencia experiencia) {
        repository.save(experiencia);
    }
    
}
