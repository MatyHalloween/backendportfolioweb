/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.controller;

import com.argentinaprograma.backendportfolioweb.model.Usuario;
import com.argentinaprograma.backendportfolioweb.model.dto.UserDto;
import com.argentinaprograma.backendportfolioweb.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
    @Autowired
    AuthService service;
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto){
        return service.isUserEnabled(userDto);
    }
    
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario) throws Exception {
        service.crearUsuario(usuario);
    }
    
    
}
