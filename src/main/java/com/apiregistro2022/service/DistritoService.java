
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Categoria;
import com.apiregistro2022.entity.Distrito;
import java.util.List;
import java.util.Optional;


public interface DistritoService {
    List<Distrito> findAll(); // Mostrar Todo
    List<Distrito> findAllCustom();    //Mostrar todos los habilitdos
    List<Distrito> findbyName();   //Buscar por nombre
    Optional<Distrito>  findById(Long id); //Buscar por id
    Distrito add(Distrito di);     //Agregar
    Distrito update(Distrito di);  //Actualizar
    Distrito delete(Distrito di);  //Eliminar
    
}
