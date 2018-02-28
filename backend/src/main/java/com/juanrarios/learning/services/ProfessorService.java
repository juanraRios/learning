package com.juanrarios.learning.services;

import java.util.List;

import com.juanrarios.learning.domain.Professor;

public interface ProfessorService {

	List<Professor> findAll();

	Professor findOne(long id);

}
