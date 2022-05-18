/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.repository;

import com.argentinaprograma.backendportfolioweb.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maty_
 */
public interface ProyectoRepository extends JpaRepository <Proyecto, Long>{
    
}
