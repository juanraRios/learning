package com.juanrarios.learning.controllers;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.juanrarios.learning.domain.Professor;
import com.juanrarios.learning.services.ProfessorService;

@Controller
@Path("/professors")
public class ProfessorController {

	private final ProfessorService professorService;

	@Autowired
	public ProfessorController(ProfessorService professorService) {
		this.professorService = professorService;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Professor> findAll() {
		return professorService.findAll();
	}

}
