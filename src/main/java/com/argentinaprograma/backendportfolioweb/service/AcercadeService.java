/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Acercade;
import com.argentinaprograma.backendportfolioweb.repository.AcercadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maty_
 */
@Service
public class AcercadeService implements IAcercadeService {
    
    @Autowired
    private AcercadeRepository repository;
    
    @Override
    public List<Acercade> obtenerAcercade() {
        return repository.findAll();
    }

    @Override
    public void modificarAcercade(Acercade acercade) {
        repository.save(acercade);
        
    }
    
}
