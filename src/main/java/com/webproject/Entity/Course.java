package com.webproject.Entity;

public class Course {
	private long id;
	private String title;
	private String descryption;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	//to string
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descryption=" + descryption + "]";
	}
	//Constructor
	public Course(long id, String title, String descryption) {
		super();
		this.id = id;
		this.title = title;
		this.descryption = descryption;
	}
	
	//Gettr &Setters
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescryption() {
		return descryption;
	}


	public void setDescryption(String descryption) {
		this.descryption = descryption;
	}


	
	
	
	

}
