/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Distrito;
import com.apiregistro2022.entity.Perfil;
import com.apiregistro2022.repositorio.DistritoRepository;
import com.apiregistro2022.service.DistritoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DistritoServiceImpl implements DistritoService {

    
    @Autowired
    private DistritoRepository distritoRepository;
    
    @Override
    public List<Distrito> findAll() {
        return distritoRepository.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
        return distritoRepository.findAllCustom();
    }

    @Override
    public List<Distrito> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Distrito> findById(Long id) {
        return distritoRepository.findById(id);
    }

    @Override
    public Distrito add(Distrito di) {
        return distritoRepository.save(di);
    }

    @Override
    public Distrito update(Distrito di) {
        Distrito objDistrito = distritoRepository.getById(di.getCodigo());
        BeanUtils.copyProperties(di, objDistrito);
        return distritoRepository.save(objDistrito);
    }

    @Override
    public Distrito delete(Distrito di) {
        Distrito objDistrito = distritoRepository.getById(di.getCodigo());
        objDistrito.setEstado(false);
        return distritoRepository.save(objDistrito);
    }
    
}
