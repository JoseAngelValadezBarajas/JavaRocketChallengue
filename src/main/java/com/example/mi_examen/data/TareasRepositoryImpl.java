package com.example.mi_examen.data;

import com.example.mi_examen.mapper.TareasMapper;
import com.example.mi_examen.model.Tareas;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TareasRepositoryImpl implements TareasRepository {

    private final TareasMapper tareasMapper;

    public TareasRepositoryImpl(TareasMapper tareasMapper) {
        this.tareasMapper = tareasMapper;
    }

    @Override
    public void insert(Tareas tareas) {
        tareasMapper.insert(tareas);
    }

    @Override
    public List<Tareas> findAll() {
        return tareasMapper.findAll();
    }
}


