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
public class Banner {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String img;
    
    public Banner() {
    
    }

    public Banner(Long id, String img) {
        this.id = id;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Banner{" + "id=" + id + ", banner=" + img + '}';
    }
    
    
    
}
