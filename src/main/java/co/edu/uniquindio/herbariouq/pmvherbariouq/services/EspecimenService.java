package co.edu.uniquindio.herbariouq.pmvherbariouq.services;

import co.edu.uniquindio.herbariouq.pmvherbariouq.entities.Especimen;
import co.edu.uniquindio.herbariouq.pmvherbariouq.repositories.EspecimenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecimenService {

    @Autowired
    private EspecimenRepository especimenRepository;

    public List<Especimen> obtenerTodosEspecimenes() {
        return especimenRepository.findAll();
    }

    public Especimen guardarEspecimen(Especimen especimen) {
        return especimenRepository.save(especimen);
    }

    public void eliminarEspecimen(Long id) {
        especimenRepository.deleteById(id);
    }
}
