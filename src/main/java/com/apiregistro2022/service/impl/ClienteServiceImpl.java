/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Cliente;
import com.apiregistro2022.repositorio.ClienteRepository;
import com.apiregistro2022.service.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return  clienteRepository.findAllCustom();
    }

    @Override
    public List<Cliente> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente add(Cliente cli) {
        return clienteRepository.save(cli);
    }

    @Override
    public Cliente update(Cliente cli) {
        Cliente objCliente = clienteRepository.getById(cli.getCodigo());
        BeanUtils.copyProperties(cli, objCliente);
        return clienteRepository.save(objCliente);
    }

    @Override
    public Cliente delete(Cliente cli) {
        Cliente objCliente = clienteRepository.getById(cli.getCodigo());
        objCliente.setEstado(false);
        return clienteRepository.save(objCliente);
    }
    
}
