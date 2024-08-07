package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		String con ="in/beans/resources/applicationContext.xml";
		ApplicationContext cont = new ClassPathXmlApplicationContext(con);
		
		Student s=(Student) cont.getBean("student");
		
		s.show();
	}
}