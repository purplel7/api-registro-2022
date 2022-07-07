/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.entity;

//utilizamos Loombok

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //Contruccion
@NoArgsConstructor //metodo constructor sin parametros
@AllArgsConstructor //metodo constructor con parametros
@Data //metodos get y set
//definiendo la entidad para la persistencia de datos
@Entity(name ="Empleado")
//definiendo la tabla de la base de datos
@Table(name ="t_empleado")
public class Empleado implements Serializable{
    
    //agregamos el ID de la serializacion
    private static final long serialVersion=1L;
    //definiendo la clave primaria
    @Id
    //defines la columna
    @Column(name = "codemp")
    private long codigo;
    @Column(name = "nomemp")
    private String nombre;
    @Column(name = "apepemp")
    private String apellidopaterno;
    @Column(name = "apememp")
    private String apellidomaterno;
    @Column(name = "dniemp")
    private String dni;
    @Column(name = "diremp")
    private String direccion;
    @Column(name = "telemp")
    private String telefono;
    @Column(name = "celemp")
    private String celular;
    
    @Column(name = "coremp")
    private String correo;
    
    @Column(name = "sexemp")
    private String sexo;
    
    @Column(name = "usuemp")
    private String usuario;
    
    @Column(name = "claemp")
    private String clave;
    
    @Column(name = "estemp")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name ="coddis", nullable = false)
    private Distrito distrito;
    @ManyToOne
    @JoinColumn(name ="codper", nullable = false)
    private Perfil perfil;
    
}
