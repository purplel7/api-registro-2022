/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Categoria;
import com.apiregistro2022.entity.Producto;
import com.apiregistro2022.repositorio.ProductoRepository;
import com.apiregistro2022.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class ProductoSerciveImpl implements ProductoService{
    
    @Autowired
    private ProductoRepository productorepository;

    @Override
    public List<Producto> findAll() {
        return productorepository.findAll();
    }

    @Override
    public List<Producto> findAllCustom() {
        return  productorepository.findAllCustom();
    }

    @Override
    public List<Producto> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productorepository.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return productorepository.save(p);
    }

    @Override
    public Producto update(Producto p) {
        Producto objProducto = productorepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objProducto);
        return productorepository.save(objProducto);
    }

    @Override
    public Producto delete(Producto p) {
        Producto objProducto = productorepository.getById(p.getCodigo());
        objProducto.setEstado(false);
        return productorepository.save(objProducto);
    }

    

    

   
    
}
