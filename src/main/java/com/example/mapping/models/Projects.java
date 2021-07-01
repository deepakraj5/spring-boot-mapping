package com.example.mapping.models;
import java.util.*;

public class Projects {

	private String id;
	private String name;
	private String description;
	private List<Users> users;
	private Issue issue;
	
	public Projects() {
		
	}

	public Projects(String id, String name, String description, List<Users> users, Issue issue) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.users = users;
		this.issue = issue;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}
}
