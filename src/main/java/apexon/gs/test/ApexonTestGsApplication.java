package apexon.gs.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import apexon.gs.test.controller.CourceController;
import apexon.gs.test.models.Course;
import apexon.gs.test.models.CourseStatus;

@SpringBootApplication
public class ApexonTestGsApplication implements CommandLineRunner {

	@Autowired
	CourceController courceController;
	public static void main(String[] args) {
		SpringApplication.run(ApexonTestGsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Course course=new Course();
		
		course.setTitle("Java");
		course.setStatus(CourseStatus.ACTIVE);
		course.setPrice(400);
		
		courceController.saveCource(course);
	}

}
