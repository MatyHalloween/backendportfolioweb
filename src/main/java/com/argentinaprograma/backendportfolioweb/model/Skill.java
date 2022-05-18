/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author maty_
 */
@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
        
    private String name;
    private Long dato;
    private String clase;
    private String soft;
    
    public Skill(){
        
    }

    public Skill(Long id, String name, Long dato, String clase, String soft) {
        this.id = id;
        this.name = name;
        this.dato = dato;
        this.clase = clase;
        this.soft = soft;
    }

    @Override
    public String toString() {
        return "Skill{" + "id=" + id + ", name=" + name + ", dato=" + dato + ", clase=" + clase + ", soft=" + soft + '}';
    }
    
}
