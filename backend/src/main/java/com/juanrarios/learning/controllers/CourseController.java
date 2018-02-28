package com.juanrarios.learning.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.juanrarios.learning.domain.Course;
import com.juanrarios.learning.services.CourseService;

@Controller
@Path("/courses")
public class CourseController {

	private final CourseService courseService;

	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> findAllWithProfessor() {
		return courseService.findAllWithProfessor();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Course findOne(@PathParam("id") long id) {
		return courseService.findOneWithProfessor(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Course course, @Context UriInfo uriInfo) {

		courseService.create(course);

		return Response.status(Response.Status.CREATED.getStatusCode())
				.header("Location", String.format("%s/%s", uriInfo.getAbsolutePath().toString(), course.getId()))
				.build();
	}

}
