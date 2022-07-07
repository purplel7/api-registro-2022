/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author xows_
 */
public interface CategoriaService {
    List<Categoria> findAll(); // Mostrar Todo
    List<Categoria> findAllCustom();    //Mostrar todos los habilitdos
    List<Categoria> findbyName();   //Buscar por nombre
    Optional<Categoria>  findById(Long id); //Buscar por id
    Categoria add(Categoria c);     //Agregar
    Categoria update(Categoria c);  //Actualizar
    Categoria delete(Categoria c);  //Eliminar
    
}
