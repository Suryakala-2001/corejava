package com.tns.minterface;

public class Student1 implements Registerable {
  private int id;
  private String name;
public Student1() {
	super();
}
public Student1(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + "]";
}
  
  
}
