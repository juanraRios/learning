package com.juanrarios.learning.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Repository;

import com.juanrarios.learning.domain.Course;
import com.juanrarios.learning.domain.Professor;
import com.juanrarios.learning.utils.Constants;

@Repository
public interface CourseRepository {

	@Select("SELECT id,title,level,time,available FROM course WHERE course.id=#{id}")
	Course findOne(long id);

	@Select("SELECT id,title,level,time,available,professor_id FROM course WHERE course.id=#{id}")
	@Results(value = {
			@Result(property = "professor", column = "professor_id", javaType = Professor.class,
					one = @One(select = Constants.PROFESSOR_FIND_ONE)),
	})
	Course findOneWithProfessor(long id);

	@Select("SELECT id,title,level,time,available FROM course order by title")
	List<Course> findAll();

	@Select("SELECT id,title,level,time,available,professor_id FROM course order by title")
	@Results(value = {
			@Result(property = "professor", column = "professor_id", javaType = Professor.class,
					one = @One(select = Constants.PROFESSOR_FIND_ONE)),
	})
	List<Course> findAllWithProfessor();

	@Insert("INSERT INTO course (id,title,available, level, time, professor_id) VALUES (#{id},#{title},#{available},#{level},#{time},#{professor.id})")
	@SelectKey(statement = "CALL IDENTITY()", keyProperty = "id", before = false, resultType = long.class)
	int create(Course course);

}
