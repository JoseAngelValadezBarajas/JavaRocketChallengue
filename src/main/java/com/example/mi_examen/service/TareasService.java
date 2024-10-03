package com.example.mi_examen.service;

import com.example.mi_examen.data.TareasRepository;
import com.example.mi_examen.model.Tareas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareasService {

    private final TareasRepository tareasRepository;

    public TareasService(TareasRepository tareasRepository) {
        this.tareasRepository = tareasRepository;
    }

    public void saveTareas(Tareas tareas) {
        tareasRepository.insert(tareas);
    }

    public List<Tareas> getAllTareas() {
        return tareasRepository.findAll();
    }
}

