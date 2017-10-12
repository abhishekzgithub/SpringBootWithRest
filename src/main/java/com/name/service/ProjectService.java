package com.name.service;

import com.name.entity.ProjectEntity;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.name.dao.ProjectDaoInterface;

@Service
public class ProjectService {
	@Autowired
	private ProjectDaoInterface projectInterface;
	public Collection<ProjectEntity> getAllProject()
	{
		return this.projectInterface.getAllProject(); 
	}

	//Show By id
	public ProjectEntity getProjectById(String id) {
		return this.projectInterface.getProjectById(id);
	}

	//Delete
	public ProjectEntity deleteProjectById(String id) {
		return this.projectInterface.deleteProjectById(id);
	}

	//Update
	public void updateProject(ProjectEntity projects) {
		this.projectInterface.updateProject(projects);
	}

	//Add
	public void insertProject(ProjectEntity projects) {
		this.projectInterface.insertProject(projects);
	}

}
