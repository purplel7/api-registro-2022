
package com.apiregistro2022.service;


import com.apiregistro2022.entity.Perfil;
import java.util.List;
import java.util.Optional;


public interface PerfilService {
    List<Perfil> findAll();
    List<Perfil> findAllCustom();   
    List<Perfil> findbyName();   
    Optional<Perfil>  findById(Long id); 
    Perfil add(Perfil pe);    
    Perfil update(Perfil pe);  
    Perfil delete(Perfil pe);  
    
}
