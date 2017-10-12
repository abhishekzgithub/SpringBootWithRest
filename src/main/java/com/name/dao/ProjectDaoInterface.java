package com.name.dao;

import java.util.Collection;

import com.name.entity.ProjectEntity;

public interface ProjectDaoInterface {

	//showall,add,update,delete
	Collection<ProjectEntity> getAllProject();

	//Show By id
	ProjectEntity getProjectById(String id);

	//Delete
	ProjectEntity deleteProjectById(String id);

	//Update
	void updateProject(ProjectEntity projects);

	//Add
	void insertProject(ProjectEntity projects);

}