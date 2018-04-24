package com.udemy.converter;

import org.springframework.stereotype.Component;

import com.udemy.entity.Course;
import com.udemy.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {
	
	//Entity --> Model
	public CourseModel entity2model(Course course) {
		CourseModel courseModel = new CourseModel();
		courseModel.setName(course.getName());
		courseModel.setName(course.getDescription());
		courseModel.setPrice(course.getPrice());
		courseModel.setHours(course.getHours());
		return courseModel;
		
	}
	
	//Model  --> Entity
	public Course model2entity(CourseModel courseModel) {
	Course course = new Course();
	course.setName(courseModel.getName());
	courseModel.setName(courseModel.getDescription());
	courseModel.setPrice(courseModel.getPrice());
	courseModel.setHours(courseModel.getHours());
	return course;
			
	}

} 
