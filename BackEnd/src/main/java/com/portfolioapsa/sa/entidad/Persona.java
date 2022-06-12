package com.portfolioapsa.sa.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(min =1, max = 50, message = "Longitud incorrecta")
    private String nombre;

    @NotNull
    @Size(min =1, max = 50, message = "Longitud incorrecta")
    private String apellido;

    @Size(min =1, max = 50, message = "Longitud incorrecta")
    private String img;

}
