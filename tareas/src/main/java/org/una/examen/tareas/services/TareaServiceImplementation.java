/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.tareas.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.examen.tareas.dtos.TareaDTO;
import org.una.examen.tareas.entities.Tarea;
import org.una.examen.tareas.repositories.ITareaRepository;
import org.una.examen.tareas.utils.ConversionLista;
import org.una.examen.tareas.utils.MapperUtils;

/**
 *
 * @author colo7
 */
@Service
public class TareaServiceImplementation implements ITareaService {

    @Autowired
    private ITareaRepository tareaRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<TareaDTO> findById(Long id) {
        return (Optional<TareaDTO>) ConversionLista.oneToDto(tareaRepository.findById(id), TareaDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<List<TareaDTO>> findAll() {
        return (Optional<List<TareaDTO>>) ConversionLista.findList(tareaRepository.findAll(), TareaDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<List<TareaDTO>> findByProyectoId(Long id) {
        return (Optional<List<TareaDTO>>) ConversionLista.findList(tareaRepository.findByProyectoId(id), TareaDTO.class);
    }

    @Override
    @Transactional
    public TareaDTO create(TareaDTO tarea) {
        Tarea tareaCrear = MapperUtils.EntityFromDto(tarea, Tarea.class);
        tareaCrear = tareaRepository.save(tareaCrear);
        return MapperUtils.DtoFromEntity(tareaCrear, TareaDTO.class);
    }

    @Override
    @Transactional
    public Optional<TareaDTO> update(TareaDTO tarea, Long id) {
        if (tareaRepository.findById(id).isPresent()) {
            System.out.println(tarea.getFechaInicio());
            Tarea tareaEditar = MapperUtils.EntityFromDto(tarea, Tarea.class);
            System.out.println(tareaEditar.getFechaInicio());
            tareaEditar = tareaRepository.save(tareaEditar);
            System.out.println(tareaEditar.getFechaInicio());
            return Optional.ofNullable(MapperUtils.DtoFromEntity(tareaEditar, TareaDTO.class));
        } else {
            return null;
        }
    }

    @Override
    @Transactional
    public void delete(Long id) {
        tareaRepository.deleteById(id);
    }

}
