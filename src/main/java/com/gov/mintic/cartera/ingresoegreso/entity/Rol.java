package com.gov.mintic.cartera.ingresoegreso.entity;

import jakarta.persistence.*;
//import javax.persistence.*;

@Entity
@Table(name="roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol", nullable = false)
    private Long idRol;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "estado")
    private boolean estado;

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String  toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
