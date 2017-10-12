package com.name.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.name.entity.ProjectEntity;


@Repository
//@Qualifier("mysql")
public class ProjectDao implements ProjectDaoInterface {
	
	private static  Map<String,ProjectEntity> project;
	
	static {
		project = new HashMap<String,ProjectEntity>();
		project.put("1", new ProjectEntity("1","name1","ln1"));
		project.put("2", new ProjectEntity("2","name2","ln2"));
		project.put("3", new ProjectEntity("3","name3","ln3"));
		project.put("4", new ProjectEntity("4","name4","ln4"));
		project.put("5", new ProjectEntity("5","name5","ln5"));		
	}
	
	//showall,add,update,delete
	/* (non-Javadoc)
	 * @see com.name.dao.ProjectInterface#getAllProject()
	 */
	@Override
	public Collection<ProjectEntity> getAllProject()
	{
		return this.project.values();
	}
	//Show By id
	/* (non-Javadoc)
	 * @see com.name.dao.ProjectInterface#getProjectById(int)
	 */
	@Override
	public ProjectEntity getProjectById(String id)
	{
		return this.project.get(id);
	}
	//Delete
	/* (non-Javadoc)
	 * @see com.name.dao.ProjectInterface#deleteProjectById(int)
	 */
	@Override
	public ProjectEntity deleteProjectById(String id)
	{
		return this.project.remove(id);
	}
	//Update
	/* (non-Javadoc)
	 * @see com.name.dao.ProjectInterface#updateProject(com.name.entity.ProjectEntity)
	 */
	@Override
	public void updateProject(ProjectEntity projects)
	{
		ProjectEntity s = project.get(projects.getId());
	        s.setLn(projects.getLn());
	        s.setName(projects.getName());
	        project.put(projects.getId(), projects); 
	}
	//Add
	
	@Override
	public void insertProject(ProjectEntity projects)
	{
		this.project.put(projects.getId(), projects);
	}
	

}
