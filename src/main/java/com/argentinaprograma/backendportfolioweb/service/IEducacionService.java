/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> obtenerEducacion();
    
    public void crearEducacion(Educacion educacion);
    
    public void borrarEducacion(Long id);
    
    public Educacion obtenerEducacion(Long id);
    
    public void modificarEducacion(Educacion educacion);
    
    
}
