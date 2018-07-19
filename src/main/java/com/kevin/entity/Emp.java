package com.kevin.entity;

public class Emp {
private String id;
private String name;
private String age;
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
@Override
public boolean equals(Object arg0) {
	// TODO Auto-generated method stub
	return super.equals(arg0);
}
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(String id, String name, String age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public String getId() {
	return id;
}
public void setId(String string) {
	this.id = string;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}



}
