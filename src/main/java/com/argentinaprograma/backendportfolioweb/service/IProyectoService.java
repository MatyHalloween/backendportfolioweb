/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Proyecto;
import java.util.List;

/**
 *
 * @author maty_
 */
public interface IProyectoService {
    
    public List<Proyecto> obtenerProyecto();
    
    public void crearProyecto(Proyecto proyecto);
    
    public void borrarProyecto(Long id);
    
    public Proyecto obtenerProyecto(Long id);
    
    public void modificarProyecto(Proyecto proyecto);
    
}
