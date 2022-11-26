package com.course.structure;

public class School extends Building{
	private int classrooms;
	private int grade;

	public void setClassrooms(int classrooms){
		this.classrooms = classrooms;
	}
	public void setGrade(int grade){
		this.grade = grade;
	}
	public int getClassrooms(){
		return classrooms;
	}
	public int getGrade(){
		return grade;
	}

}
