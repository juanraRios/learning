package com.juanrarios.learning.services;

import java.util.List;

import com.juanrarios.learning.domain.Course;

public interface CourseService {

	List<Course> findAllWithProfessor();

	Course findOne(long id);

	Course findOneWithProfessor(long id);

	int create(Course course);

}
