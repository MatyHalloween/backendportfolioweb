/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.repository;

import com.argentinaprograma.backendportfolioweb.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author maty_
 */
@Repository
public interface AuthRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findByEmailAndIsEnabledTrue(String email);
}