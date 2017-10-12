package com.name.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.name.entity.ProjectEntity;
import com.name.service.ProjectService;

@RestController
@RequestMapping("/start")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@RequestMapping(method=RequestMethod.GET)
	public Collection<ProjectEntity> getAllProject(){
		return this.projectService.getAllProject();
	}

	//Show By id
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ProjectEntity getProjectById(@PathVariable("id") String id) {
		return this.projectService.getProjectById(id);
	}

	//Delete
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ProjectEntity deleteProjectById(@PathVariable("id") String id) {
		return this.projectService.deleteProjectById(id);
	}

	//Update
	@RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateProject(@RequestBody ProjectEntity projects) {
		this.projectService.updateProject(projects);
	}

	//Add
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertProject(@RequestBody ProjectEntity projects) {
		this.projectService.insertProject(projects);
	}
}
