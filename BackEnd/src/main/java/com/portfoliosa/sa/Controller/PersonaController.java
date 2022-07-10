package com.portfoliosa.sa.Controller;

import com.portfoliosa.sa.Entity.Persona;
import com.portfoliosa.sa.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService iPersonaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return iPersonaService.getPersona();
    }

    @PostMapping("personas/crear")
    public String createPersona(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        iPersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("imagen") String nuevaImagen)  {
        Persona persona = iPersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImagen(nuevaImagen);
        iPersonaService.savePersona(persona);
        return persona;
    }

    @GetMapping("/personas/traer/perfil/{id}")
    public Persona findPersona(@PathVariable Long id) {
        Persona persona = iPersonaService.findPersona(id);
        return persona;
    }

}
