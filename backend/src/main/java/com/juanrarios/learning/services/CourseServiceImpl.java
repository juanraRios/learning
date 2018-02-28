package com.juanrarios.learning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanrarios.learning.domain.Course;
import com.juanrarios.learning.repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	private CourseRepository courseRepository;

	@Autowired
	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> findAllWithProfessor() {
		return courseRepository.findAllWithProfessor();
	}

	@Override
	public Course findOne(long id) {
		return courseRepository.findOne(id);
	}

	@Override
	public Course findOneWithProfessor(long id) {
		return courseRepository.findOneWithProfessor(id);
	}

	@Override
	public int create(Course course) {

		return courseRepository.create(course);
	}

}
