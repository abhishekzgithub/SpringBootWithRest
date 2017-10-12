package com.name.entity;
public class ProjectEntity {
	private String id;
	private String name;
	private String ln;
	
	public ProjectEntity() {
		
	}
	public ProjectEntity(String id, String name, String ln) {
		super();
		this.id = id;
		this.name = name;
		this.ln = ln;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}

	
}
