/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Perfil;
import com.apiregistro2022.repositorio.PerfilRepository;
import com.apiregistro2022.service.PerfilService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PerfilServiceImpl implements PerfilService{
    
    @Autowired
    private PerfilRepository perfilRepository;

    @Override
    public List<Perfil> findAll() {
        return perfilRepository.findAll();
    }

    @Override
    public List<Perfil> findAllCustom() {
        return perfilRepository.findAllCustom();
    }

    @Override
    public List<Perfil> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Perfil> findById(Long id) {
        return perfilRepository.findById(id);
    }

    @Override
    public Perfil add(Perfil pe) {
        return perfilRepository.save(pe);
    }

    @Override
    public Perfil update(Perfil pe) {
        Perfil objPerfil = perfilRepository.getById(pe.getCodigo());
        BeanUtils.copyProperties(pe, objPerfil);
        return perfilRepository.save(objPerfil);
    }

    @Override
    public Perfil delete(Perfil pe) {
        Perfil objPerfil = perfilRepository.getById(pe.getCodigo());
        objPerfil.setEstado(false);
        return perfilRepository.save(objPerfil);
    }
    
}
