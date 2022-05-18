/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Acercade;
import java.util.List;

/**
 *
 * @author maty_
 */
public interface IAcercadeService {
    
    public List<Acercade> obtenerAcercade();
    
    public void modificarAcercade (Acercade acercade);
    
}
