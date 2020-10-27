/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.tareas.services;

import java.util.List;
import java.util.Optional;
import org.una.examen.tareas.dtos.ProyectoDTO;

/**
 *
 * @author colo7
 */
public interface IProyectoService {

    public Optional<List<ProyectoDTO>> findAll();

    public Optional<ProyectoDTO> findById(Long id);

    public Optional<List<ProyectoDTO>> findByNombreContainingIgnoreCase(String nombre);

    public ProyectoDTO create(ProyectoDTO proyecto);

    public Optional<ProyectoDTO> update(ProyectoDTO proyecto, Long id);

    public void delete(Long id);
}
