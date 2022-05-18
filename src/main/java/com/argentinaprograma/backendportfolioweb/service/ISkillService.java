/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Skill;
import java.util.List;

/**
 *
 * @author maty_
 */
public interface ISkillService {
    
    public List<Skill> obtenerSkill();
    
    public void crearSkill (Skill skill);
    
    public void borrarSkill(Long id);
    
    public Skill obtenerSkill(Long id);
    
    public void modificarSkill(Skill skill);
    
}
