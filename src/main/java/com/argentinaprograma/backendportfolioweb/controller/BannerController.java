/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.controller;


import com.argentinaprograma.backendportfolioweb.model.Banner;
import com.argentinaprograma.backendportfolioweb.service.IBannerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author maty_
 */
@RestController
public class BannerController {
    
    @Autowired
    public IBannerService service;
    
    @GetMapping("/banner")
    @ResponseBody
    public List<Banner> obtenerBanner(){
        return service.obtenerBanner();
    }
    
    @PutMapping("/banner/update")
    public void modificarBanner(@RequestBody Banner banner){
        service.modificarBanner(banner);
    
}
    
}
