/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiregistro2022.repositorio;

import com.apiregistro2022.entity.Distrito;
import com.apiregistro2022.entity.Perfil;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author xows_
 */
public interface PerfilRepository extends JpaRepository<Perfil, Long>{
    
    // Funcion para mostrar todos las categorias habilitadas
    @Query("select pe from Perfil pe where pe.estado='1'") 
    List<Perfil> findAllCustom();
}
