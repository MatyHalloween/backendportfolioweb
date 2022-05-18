/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.backendportfolioweb.service;

import com.argentinaprograma.backendportfolioweb.model.Banner;
import java.util.List;

/**
 *
 * @author maty_
 */
public interface IBannerService {
    
    public List<Banner> obtenerBanner();
    
    public void modificarBanner(Banner banner);
    
}
