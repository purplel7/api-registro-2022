
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

@Entity(name="Distrito")
@Table(name="t_distrito")

//implementamos serializavle para que se una clase de Spring Boot
public class Distrito implements Serializable{
    
    //agregamos el ID de la serializacion
    private static final long serialVersion=1L;
    @Id
    @Column(name = "coddis")
    private long codigo;
    @Column(name = "nomdis")
    private String nombre;
    @Column(name = "estdis")
    private boolean estado;
    
}
