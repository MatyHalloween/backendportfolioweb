/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Skill;
import com.argentinaprograma.backendportfolioweb.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maty_
 */
@Service
public class SkillService implements ISkillService {
    
    @Autowired
    private SkillRepository repository;
    

    @Override
    public List<Skill> obtenerSkill() {
        return repository.findAll();
    }

    @Override
    public void crearSkill(Skill skill) {
        repository.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Skill obtenerSkill(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarSkill(Skill skill) {
        repository.save(skill);
    }
    
}
