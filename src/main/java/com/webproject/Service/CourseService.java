package com.webproject.Service;

import java.util.List;

import com.webproject.Entity.Course;

public interface CourseService {

	public List<Course> getcourses();
	
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public Course deleteCourse(long parselong);
}
