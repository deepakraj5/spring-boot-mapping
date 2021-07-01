package com.example.mapping.models;
import java.util.List;

public class Users {

	private String id;
	private String name;
	private String email;
	
	private List<Projects> projects;
	
	public Users() {
		
	}
	
	public Users(String id, String name, String email, List<Projects> projects) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.projects = projects;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}
}
