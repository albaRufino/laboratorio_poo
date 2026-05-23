/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.practicaweb.repository;

import com.ejemplo.practicaweb.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alba
 */
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
