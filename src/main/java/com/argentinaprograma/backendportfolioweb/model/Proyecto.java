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
public class Proyecto {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String img;
    private String url;
    
    public Proyecto(){
        
    }
    
    public Proyecto(Long id, String img, String url){
        this.id = id;
        this.img = img;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id=" + id + ", img=" + img + ", url=" + url + '}';
    }
    
    
    
}
