package com.example.mi_examen.controller;

import com.example.mi_examen.model.Tareas;
import com.example.mi_examen.service.TareasService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TareasController {
	
	private final TareasService tareasService;

    public TareasController(TareasService tareasService) {
        this.tareasService = tareasService;
    }
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDate.class, "fechainicio", new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/tareas/nueva")
    public String newTareasForm(Model model) {
        model.addAttribute("tareas", new Tareas());
        return "nuevas_tareas";
    }

    @PostMapping("/tareas")
    public String saveTareas(@ModelAttribute Tareas tareas) {
        tareasService.saveTareas(tareas);
        return "redirect:/tareas";
    }

    @GetMapping("/tareas")
    public String listTareas(Model model) {
        model.addAttribute("tareas", tareasService.getAllTareas());
        return "tareas_lista";
    }
	
}
