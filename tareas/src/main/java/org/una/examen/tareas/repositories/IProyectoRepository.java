/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.tareas.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.examen.tareas.entities.Proyecto;

/**
 *
 * @author colo7
 */
public interface IProyectoRepository extends JpaRepository<Proyecto, Long> {

    public List<Proyecto> findByNombreContainingIgnoreCase(String nombre);
}
