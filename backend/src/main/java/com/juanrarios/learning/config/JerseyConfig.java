package com.juanrarios.learning.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.juanrarios.learning.controllers.CourseController;
import com.juanrarios.learning.controllers.ProfessorController;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(CourseController.class);
		register(ProfessorController.class);
	}

}
