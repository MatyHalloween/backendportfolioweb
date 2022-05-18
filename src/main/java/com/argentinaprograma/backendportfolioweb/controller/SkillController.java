/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.controller;

import com.argentinaprograma.backendportfolioweb.model.Skill;
import com.argentinaprograma.backendportfolioweb.service.ISkillService;
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

@RestController
public class SkillController {
    
    @Autowired
    public ISkillService service;
    
    @GetMapping("/skill")
    @ResponseBody
    public List<Skill> obtenerSkill(){
        return service.obtenerSkill();
    }
    
    @PostMapping("/skill/create")
    public void crearSkill(@RequestBody Skill skill){
        service.crearSkill(skill);
    }
    
    @DeleteMapping("/skill/{id}")
    public void borrarSkill(@PathVariable Long id){
        service.borrarSkill(id);
    }
    
    @GetMapping("/skill/{id}")
    @ResponseBody
    public Skill obtenerSkill(@PathVariable Long id){
        return service.obtenerSkill(id);
    }
    
    @PutMapping("/skill/{id}/update")
    public void modificarSkill (@RequestBody Skill skill){
        service.modificarSkill(skill);
    }
    
    
}
