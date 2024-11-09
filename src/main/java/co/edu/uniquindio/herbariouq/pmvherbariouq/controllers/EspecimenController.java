package co.edu.uniquindio.herbariouq.pmvherbariouq.controllers;

import co.edu.uniquindio.herbariouq.pmvherbariouq.entities.Especimen;
import co.edu.uniquindio.herbariouq.pmvherbariouq.services.EspecimenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/especimenes")
public class EspecimenController {

    @Autowired
    private EspecimenService especimenService;

    @GetMapping
    public List<Especimen> listarEspecimenes() {
        return especimenService.obtenerTodosEspecimenes();
    }

    @PostMapping
    public Especimen crearEspecimen(@RequestBody Especimen especimen) {
        return especimenService.guardarEspecimen(especimen);
    }

    @DeleteMapping("/{id}")
    public void eliminarEspecimen(@PathVariable Long id) {
        especimenService.eliminarEspecimen(id);
    }
}
