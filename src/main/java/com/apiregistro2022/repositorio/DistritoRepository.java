/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiregistro2022.repositorio;


import com.apiregistro2022.entity.Distrito;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author xows_
 */
public interface DistritoRepository extends JpaRepository<Distrito, Long>{
    
    // Funcion para mostrar todos las categorias habilitadas
    @Query("select di from Distrito di where di.estado='1'") 
    List<Distrito> findAllCustom();
    
    
    //@Query("select c from Categoria c where upper(c.nombre) like upper(:nombre) and c.estado='1'")
    //List<Categoria> findByName(@Param("nombre") String nombre);
    
    
    
}
