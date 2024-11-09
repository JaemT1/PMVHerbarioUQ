package co.edu.uniquindio.herbariouq.pmvherbariouq.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Especimen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombreCientifico;
    @Column(nullable = false)
    private String recolector;
    private String lugarRecolecta;
    private LocalDate fechaRecolecta;
    private String detallesEcologicos;
    private String linkFoto;


}



