package com.webproject.ServiceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.webproject.Entity.Course;
import com.webproject.Service.CourseService;

@Service
public class CourseImplementation implements CourseService {

	List<Course> list;
	public CourseImplementation()
	{
		list=new ArrayList<>();
		list.add(new Course (145,"JavaCourse","This couse contain core concept of java"));
		list.add(new Course (142,"Spring Boot","In this project we are learning basics of SpringBoot"));
		
	}
	
	
	
	@Override
	public List<Course> getcourses() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}



	@Override
	public Course addCourse(Course course) {
		list.add(course);
		
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		list.forEach(e -> {
			if(e.getId()==course.getId())
			{
				e.setTitle(course.getTitle());
				e.setDescryption(course.getDescryption());
			}
		});
		return course;				
	}



	@Override
	public Course deleteCourse(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		return null;
	}
	
	

}
