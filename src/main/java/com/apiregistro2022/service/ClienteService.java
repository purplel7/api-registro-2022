/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Cliente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author xows_
 */
public interface ClienteService {
    
    List<Cliente> findAll(); // Mostrar Todo
    List<Cliente> findAllCustom();    //Mostrar todos los habilitdos
    List<Cliente> findbyName();   //Buscar por nombre
    Optional<Cliente>  findById(Long id); //Buscar por id
    Cliente add(Cliente cli);     //Agregar
    Cliente update(Cliente cli);  //Actualizar
    Cliente delete(Cliente cli);  //Eliminar
    
}
