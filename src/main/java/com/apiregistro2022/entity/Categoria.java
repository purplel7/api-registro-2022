
package com.apiregistro2022.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

//Definiendo la entidad en Spring para la presistencia de datos
@Entity(name="Categoria")

//Defieniendo la tabla de la base de datos
@Table(name="t_categoria")
//Para que se una clase s Spring se tiene que serializar
@Builder
public class Categoria implements Serializable {
    
    //Agregamos el ID de la serializacion
    private static final long serialVersion =1L;
    
    //Definimos la clave primaria
    @Id
    //Defines la columnas
    @Column(name = "codcat")
    private long codigo;
    @Column(name = "nomcat")
    private String nombre;
    @Column(name = "estcat")
    private boolean estado;

    public Categoria() {
    }

    public Categoria(long codigo, String nombre, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
