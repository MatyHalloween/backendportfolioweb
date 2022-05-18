/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Banner;
import com.argentinaprograma.backendportfolioweb.repository.BannerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maty_
 */
@Service
public class BannerService implements IBannerService {
    
    @Autowired
    private BannerRepository repository;

    @Override
    public List<Banner> obtenerBanner() {
        return repository.findAll();
    }

    @Override
    public void modificarBanner(Banner banner) {
        repository.save(banner);
    
    }
}
