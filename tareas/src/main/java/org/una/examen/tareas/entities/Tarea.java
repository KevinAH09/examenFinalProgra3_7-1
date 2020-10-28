/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.tareas.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.una.examen.tareas.dtos.TareaDTO;

/**
 *
 * @author colo7
 */
@Entity
@Table(name = "exa_kah_tareas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String descripcion;

    @Column(length = 25)
    private String nombre;

    @Column
    private double importancia;

    @Column
    private double urgencia;

    @Column(name = "procentaje_avance")
    private double procentajeAvance;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyectoId;

    @Column(name = "fecha_inicio", updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;

    @Column(name = "fecha_finalizacion", updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinalizacion;

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

}
