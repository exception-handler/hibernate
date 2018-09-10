package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="InstructorDetails")
public class InstructorDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	private int id;
	@Column(name="Instructor_location")
	private String location;
	@Column(name="Instructor_LinkedIn")
	private String linkedIn;
	
	@OneToOne(mappedBy="instructorDetails",cascade=CascadeType.ALL)
	private Instructor instructor;
	
	public InstructorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InstructorDetails(int id, String location, String linkedIn) {
		super();
		this.id = id;
		this.location = location;
		this.linkedIn = linkedIn;
	}
	public InstructorDetails(String location, String linkedIn) {
		super();
		this.location = location;
		this.linkedIn = linkedIn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	
	
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", location=" + location + ", linkedIn=" + linkedIn + "]";
	}
	
	
}
