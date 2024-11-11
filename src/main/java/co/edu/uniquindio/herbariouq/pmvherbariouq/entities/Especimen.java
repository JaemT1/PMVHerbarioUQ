package co.edu.uniquindio.herbariouq.pmvherbariouq.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getRecolector() {
        return recolector;
    }

    public void setRecolector(String recolector) {
        this.recolector = recolector;
    }

    public String getLugarRecolecta() {
        return lugarRecolecta;
    }

    public void setLugarRecolecta(String lugarRecolecta) {
        this.lugarRecolecta = lugarRecolecta;
    }

    public LocalDate getFechaRecolecta() {
        return fechaRecolecta;
    }

    public void setFechaRecolecta(LocalDate fechaRecolecta) {
        this.fechaRecolecta = fechaRecolecta;
    }

    public String getDetallesEcologicos() {
        return detallesEcologicos;
    }

    public void setDetallesEcologicos(String detallesEcologicos) {
        this.detallesEcologicos = detallesEcologicos;
    }

    public String getLinkFoto() {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }

    public Especimen(Long id, String nombreCientifico, String recolector, String lugarRecolecta, LocalDate fechaRecolecta, String detallesEcologicos, String linkFoto) {
        this.id = id;
        this.nombreCientifico = nombreCientifico;
        this.recolector = recolector;
        this.lugarRecolecta = lugarRecolecta;
        this.fechaRecolecta = fechaRecolecta;
        this.detallesEcologicos = detallesEcologicos;
        this.linkFoto = linkFoto;
    }

    public Especimen() {
    }
}



