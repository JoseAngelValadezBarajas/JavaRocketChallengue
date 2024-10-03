package com.example.mi_examen.data;

import com.example.mi_examen.model.Tareas;

import java.util.List;

public interface TareasRepository {
    void insert(Tareas tareas);
    List<Tareas> findAll();
}