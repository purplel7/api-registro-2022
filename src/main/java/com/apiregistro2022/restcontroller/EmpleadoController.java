/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.restcontroller;

//Agregamos la anotacion para que sea un controlar

import com.apiregistro2022.entity.Empleado;

import com.apiregistro2022.service.EmpleadoService;
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
@RequestMapping("/empleado")
public class EmpleadoController {
    
     @Autowired
    private EmpleadoService empleadoService;
     
     //Para poder obtener valores utilizamos la anotacion GetMapping
    @GetMapping
    public List<Empleado> finAll(){
        return empleadoService.findAll();
    }
    
    @GetMapping("/custom")//trae los de estado true
    public List<Empleado> findAllCustom(){
        return empleadoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Empleado> findById(@PathVariable long id){
        return empleadoService.findById(id);
    }
    
    //Emviar valores
    @PostMapping
    public Empleado add(@RequestBody Empleado em){
        return empleadoService.add(em);
    }
    
    //Actualizar valores
    @PutMapping("/{id}")
    public  Empleado update (@PathVariable Long id, @RequestBody Empleado em){
        em.setCodigo(id);
        return empleadoService.update(em);
    }
    
    //eliminar Valores
    @DeleteMapping("/{id}")
    public  Empleado delete (@PathVariable Long id){
        Empleado objEmpleado = new Empleado();
        objEmpleado.setCodigo(id);
        return empleadoService.delete(objEmpleado);
    }
    
}
