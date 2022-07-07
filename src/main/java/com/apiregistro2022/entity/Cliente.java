/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiregistro2022.entity;
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
@Entity(name ="Cliente")
//definiendo la tabla de la base de datos
@Table(name ="t_cliente")
public class Cliente implements Serializable{
    //agregamos el ID de la serializacion
    private static final long serialVersion=1L;
    //definiendo la clave primaria
    @Id
    //defines la columna
    @Column(name = "codcli")
    private long codigo;
    
    @Column(name = "nomcli")
    private String nombre;
    
    @Column(name = "apepcli")
    private String apellidopaterno;
    
    @Column(name = "apemcli")
    private String apellidomaterno;
    
    @Column(name = "dnicli")
    private String dni;
    
    @Column(name = "dircli")
    private String direccion;
    
    @Column(name = "telcli")
    private String telefono;
    
    @Column(name = "celcli")
    private String celular;
    
    @Column(name = "corcli")
    private String correo;
    
    @Column(name = "sexcli")
    private String sexo;
    
   
    
    @Column(name = "estcli")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name ="coddis", nullable = false)
    private Distrito distrito;
    
    
}
