/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.practicaweb.controller;

import com.ejemplo.practicaweb.entity.Producto;
import com.ejemplo.practicaweb.repository.ProductoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alba
 */

@Controller
public class ProductoController {
    
    private ProductoRepository repo;
    
    public ProductoController(ProductoRepository repo){
        this.repo = repo;
    }
    
    @GetMapping("/")
    public String listar(Model model){
        model.addAttribute("productos", repo.findAll());
        
        return "index";
    }
    
    @PostMapping("/guardar")
    public String guardar(@RequestParam String nombre,
                         @RequestParam double precio,
                         @RequestParam int stock,
                         @RequestParam String categoria){
        repo.save(new Producto(nombre, precio, stock, categoria));
        
        return "redirect:/";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        
        repo.deleteById(id);
        
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id,
                         Model model) {

        Producto producto = repo.findById(id).orElse(null);

        model.addAttribute("producto", producto);

        return "editar";
    }
    
    @PostMapping("/actualizar/{id}")
    public String actualizar(@PathVariable Long id,
                             @ModelAttribute Producto producto) {

        producto.setId(id);

        repo.save(producto);

        return "redirect:/";
    }

}
