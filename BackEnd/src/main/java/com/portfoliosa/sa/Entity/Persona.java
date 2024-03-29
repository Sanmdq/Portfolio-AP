package com.portfoliosa.sa.Entity;

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
    private Long id_persona;

    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String apellido;

    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String imagen;

}
