package com.portfoliosa.sa.Interface;

import com.portfoliosa.sa.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    // traer una lista de personas
    public List<Persona> getPersona();

    // guardar un objeto de tipo Persona
    public void savePersona(Persona persona);

    // eliminar un objeto buscandolo por id
    public void deletePersona(Long id);

    // buscar una persona por id
    public Persona findPersona(Long id);


}
