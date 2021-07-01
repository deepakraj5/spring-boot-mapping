package com.example.mapping.RestControllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.models.Projects;
import com.example.mapping.models.Users;

@RestController
@RequestMapping(path = "/api/v1")
public class TestController {

	@PostMapping("/users")
	public Users postUsers(@RequestBody Users users) {
		System.out.println("users ----------------------------------------- " + users);
		return users;
	}
	
	@PostMapping("/projects")
	public Projects postProjects(@RequestBody Projects projects) {
		System.out.println("projects ----------------------------------------- " + projects);
		return projects;
	}
}
