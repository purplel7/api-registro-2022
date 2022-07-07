/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.restcontroller;

//Agregamos la anotacion para que sea un controlar

import com.apiregistro2022.entity.Categoria;
import com.apiregistro2022.entity.Perfil;
import com.apiregistro2022.service.PerfilService;
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

@RestController

//Argegamos el nombre con el cual se va a buscar el controlador rest
@RequestMapping("/perfil")
public class PerfilController {
    
    @Autowired
    private PerfilService perfilService;
    
     //Para poder obtener valores utilizamos la anotacion GetMapping
    @GetMapping
    public List<Perfil> finAll(){
        return perfilService.findAll();
    }
    
    
    @GetMapping("/custom")//trae los de estado true
    public List<Perfil> findAllCustom(){
        return perfilService.findAllCustom();
    }
    
     @GetMapping("/{id}")
    public Optional<Perfil> findById(@PathVariable long id){
        return perfilService.findById(id);
    }
    
    //Emviar valores
    @PostMapping
    public Perfil add(@RequestBody Perfil pe){
        return perfilService.add(pe);
    }
    
    //Actualizar valores
    @PutMapping("/{id}")
    public  Perfil update (@PathVariable Long id, @RequestBody Perfil pe){
        pe.setCodigo(id);
        return perfilService.update(pe);
    }
    
    //eliminar Valores
    @DeleteMapping("/{id}")
    public  Perfil delete (@PathVariable Long id){
        Perfil objPerfil = new Perfil();
        objPerfil.setCodigo(id);
        return perfilService.delete(Perfil.builder().codigo(id).build());
    }
    
}
