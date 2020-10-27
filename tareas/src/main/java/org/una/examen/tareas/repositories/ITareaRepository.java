/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.tareas.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.una.examen.tareas.entities.Tarea;

/**
 *
 * @author colo7
 */
public interface ITareaRepository extends JpaRepository<Tarea, Long> {

    @Query("SELECT t FROM Tarea t LEFT JOIN t.proyectoId d WHERE d.id=:id")
    public List<Tarea> findByProyectoId(@Param("id") Long id);

}
