/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Experiencia;
import java.util.List;

/**
 *
 * @author maty_
 */
public interface IExperienciaService {
    
    public List<Experiencia> obtenerExperiencia();
    
    public void crearExperiencia(Experiencia experiencia);
    
    public void borrarExperiencia(Long id);
    
    public Experiencia obtenerExperiencia(Long id);
    
    public void modificarExperiencia(Experiencia experiencia);
    
}
