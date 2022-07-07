/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Empleado;
import com.apiregistro2022.repositorio.EmpleadoRepository;
import com.apiregistro2022.service.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return  empleadoRepository.findAllCustom();
    }

    @Override
    public List<Empleado> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado add(Empleado em) {
        return empleadoRepository.save(em);
    }

    @Override
    public Empleado update(Empleado em) {
        Empleado objEmpleado = empleadoRepository.getById(em.getCodigo());
        BeanUtils.copyProperties(em,objEmpleado);
        return empleadoRepository.save(objEmpleado);
    }

    @Override
    public Empleado delete(Empleado em) {
        Empleado objEmpleado = empleadoRepository.getById(em.getCodigo());
        objEmpleado.setEstado(false);
        return empleadoRepository.save(objEmpleado);
    }
    
}
