package com.juanrarios.learning.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String title;
	private Level level;
	private int time;
	private boolean available;

	private Professor professor;

	public Course() {
	}

	public Course(Long id, String title, Level level, int time, Professor professor, boolean available) {
		this.id = id;
		this.title = title;
		this.level = level;
		this.time = time;
		this.professor = professor;
		this.available = available;
	}

    @JsonProperty
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", level=");
		builder.append(level);
		builder.append(", time=");
		builder.append(time);
		builder.append(", available=");
		builder.append(available);
		builder.append(", professor=");
		builder.append(professor);
		builder.append("]");
		return builder.toString();
	}

}
