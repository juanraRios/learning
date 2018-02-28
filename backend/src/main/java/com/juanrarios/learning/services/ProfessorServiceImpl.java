package com.juanrarios.learning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanrarios.learning.domain.Professor;
import com.juanrarios.learning.repositories.ProfessorRepository;

@Service
public class ProfessorServiceImpl implements ProfessorService {

	private ProfessorRepository professorRepository;

	@Autowired
	public ProfessorServiceImpl(ProfessorRepository professorRepository) {
		this.professorRepository = professorRepository;
	}

	@Override
	public List<Professor> findAll() {
		return professorRepository.findAll();
	}

	@Override
	public Professor findOne(long id) {
		return professorRepository.findOne(id);
	}

}
