package com.bierbrauer.zebulon.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @PostMapping("")
    public Project addProject(@Valid @RequestBody Project project) {
        projectRepository.save(project);
        return project;
    }

    @GetMapping("")
    public @ResponseBody Iterable<Project> getAllProjects() {
        // This returns a JSON or XML with the users
        return projectRepository.findAll();
    }
}
