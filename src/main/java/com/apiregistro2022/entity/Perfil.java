/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//utilizamos Loombok

@Builder 
@NoArgsConstructor //contructor sin parametros
@AllArgsConstructor // = con parametros
@Data   //Genera los get a set de todos los atributos de la clase

@Entity(name="Perfil")
@Table(name="t_perfil")

public class Perfil  implements Serializable{
    
    //agregamos el ID de la serializacion
    private static final long serialVersion=1L;
    @Id
    @Column(name = "codper")
    private long codigo;
    @Column(name = "nomper")
    private String nombre;
    @Column(name = "estper")
    private boolean estado;
    
}
