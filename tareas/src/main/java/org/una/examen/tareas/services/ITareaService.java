/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.tareas.services;

import java.util.List;
import java.util.Optional;
import org.una.examen.tareas.dtos.TareaDTO;

/**
 *
 * @author colo7
 */
public interface ITareaService {

    public Optional<List<TareaDTO>> findAll();

    public Optional<TareaDTO> findById(Long id);

    public Optional<List<TareaDTO>> findByProyectoId(Long id);

    public TareaDTO create(TareaDTO tarea);

    public Optional<TareaDTO> update(TareaDTO tarea, Long id);

    public void delete(Long id);
}
