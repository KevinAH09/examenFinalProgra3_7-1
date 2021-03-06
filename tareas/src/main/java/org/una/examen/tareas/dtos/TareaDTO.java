/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.tareas.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author colo7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TareaDTO {

    private Long id;

    private String nombre;

    private String descripcion;

    private double importancia;

    private double urgencia;

    private double procentajeAvance;

    private ProyectoDTO proyectoId;

    private Date fechaInicio;

    private Date fechaFinalizacion;

}
