/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Empleado;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author xows_
 */
public interface EmpleadoService {
    
    List<Empleado> findAll(); // Mostrar Todo
    List<Empleado> findAllCustom();    //Mostrar todos los habilitdos
    List<Empleado> findbyName();   //Buscar por nombre
    Optional<Empleado>  findById(Long id); //Buscar por id
    Empleado add(Empleado em);     //Agregar
    Empleado update(Empleado em);  //Actualizar
    Empleado delete(Empleado em);  //Eliminar
    
}
