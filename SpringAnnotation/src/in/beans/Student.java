package in.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
 private int id;
 private String name;
 private float marks;
 
public int getId()
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public float getMarks() 
{
	return marks;
}
public void setMarks(float marks)
{
	this.marks = marks;
}

public void show() {
	
	System.err.println("name"+ name);
	System.err.println("ID" +id);
	System.err.println("marks"+ marks);
}
}