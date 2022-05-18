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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
        
    private String img;
    private String puesto;
    private String inicio;
    private String fin;
    private String info;
    
    public Experiencia() {
    }
    
    public Experiencia(Long id, String img, String puesto, String inicio, String fin, String info){
        this.id = id;
        this.img = img;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", img=" + img + ", puesto=" + puesto + ", inicio=" + inicio + ", fin=" + fin + ", info=" + info + '}';
    }
    
    
}
