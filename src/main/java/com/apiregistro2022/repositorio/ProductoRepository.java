/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiregistro2022.repositorio;



import com.apiregistro2022.entity.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author xows_
 */
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
     // Funcion para mostrar todos las categorias habilitadas
    @Query("select p from Producto p where p.estado='1'") 
    List<Producto> findAllCustom();
    
}
