package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s="/in/sp/resources/applicationContext.xml";
		ApplicationContext con = new ClassPathXmlApplicationContext(s);
		
		Student s1 =  (Student) con.getBean("stdId");
		s1.show();
	}

}
