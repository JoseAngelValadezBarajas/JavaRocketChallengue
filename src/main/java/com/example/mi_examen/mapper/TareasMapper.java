package com.example.mi_examen.mapper;

import com.example.mi_examen.model.Tareas;

import java.util.List;

import org.apache.ibatis.annotations.*;


@Mapper
public interface TareasMapper {
	/*
	 * @Insert("INSERT INTO tareas(nombre, descripcion, fechainicio) VALUES(#{nombre}, #{descripcion}, #{fechainicio})")
	 */
    void insert(Tareas tareas);

    /*
     * @Select("SELECT * FROM tareas")
     * */
    List<Tareas> findAll();
}
