/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.restcontroller;

import com.apiregistro2022.entity.Distrito;
import com.apiregistro2022.service.DistritoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Agregamos la anotacion para que sea un controlar
@RestController

//Argegamos el nombre con el cual se va a buscar el controlador rest
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoService;
    
     //Para poder obtener valores utilizamos la anotacion GetMapping
    @GetMapping
    public List<Distrito> finAll(){
        return distritoService.findAll();
    }
    
    
    @GetMapping("/custom")//trae los de estado true
    public List<Distrito> findAllCustom(){
        return distritoService.findAllCustom();
    }
    
     @GetMapping("/{id}")
    public Optional<Distrito> findById(@PathVariable long id){
        return distritoService.findById(id);
    }
    
    //Emviar valores
    @PostMapping
    public Distrito add(@RequestBody Distrito di){
        return distritoService.add(di);
    }
    
    //Actualizar valores
    @PutMapping("/{id}")
    public  Distrito update (@PathVariable Long id, @RequestBody Distrito di){
        di.setCodigo(id);
        return distritoService.update(di);
    }
    
    //eliminar Valores
    @DeleteMapping("/{id}")
    public  Distrito delete (@PathVariable Long id){
        Distrito objDistrito = new Distrito();
        objDistrito.setCodigo(id);
        return distritoService.delete(Distrito.builder().codigo(id).build());
    }
    
}
