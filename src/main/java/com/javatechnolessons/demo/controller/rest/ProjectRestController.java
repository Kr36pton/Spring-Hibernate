package com.javatechnolessons.demo.controller.rest;

import java.util.List;

import com.javatechnolessons.demo.dto.ProjectDTO;
import com.javatechnolessons.demo.service.IProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
public class ProjectRestController {

    @Autowired
    private IProjectService projectService;

    @GetMapping("/{id}")
    public ProjectDTO getProject(@PathVariable("id") Long id) {
        return projectService.get(id);
    }

    
}
