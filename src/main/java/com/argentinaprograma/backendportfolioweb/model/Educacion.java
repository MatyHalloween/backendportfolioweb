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

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
        
    private String img;
    private String school;
    private String titulo;
    private String inicio;
    private String fin;
    private String info;
    
    public Educacion(){
    }
    
    public Educacion(Long id, String img, String school, String titulo, String inicio, String fin, String info){
        this.id = id;
        this.img = img;
        this.school = school;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", img=" + img + ", school=" + school + ", titulo=" + titulo + ", inicio=" + inicio + ", fin=" + fin + ", info=" + info + '}';
    }
    
    
}
