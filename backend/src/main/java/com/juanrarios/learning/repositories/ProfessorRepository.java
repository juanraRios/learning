package com.juanrarios.learning.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.juanrarios.learning.domain.Professor;

@Repository
public interface ProfessorRepository {

	@Select("SELECT id,name,email FROM professor WHERE professor.id=#{id}")
	Professor findOne(long id);

	@Select("SELECT id,name,email FROM professor")
	List<Professor> findAll();

}
