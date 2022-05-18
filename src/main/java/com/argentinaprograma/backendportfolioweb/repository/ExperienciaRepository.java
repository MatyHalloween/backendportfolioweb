/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.repository;

import com.argentinaprograma.backendportfolioweb.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author maty_
 */
@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
}