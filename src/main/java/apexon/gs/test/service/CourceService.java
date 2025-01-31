package apexon.gs.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apexon.gs.test.models.Course;
import apexon.gs.test.repo.CourceRepo;

@Service
public class CourceService {

	@Autowired
	CourceRepo courceRepo;
	
	public Course saveCource(Course course) {
		return courceRepo.save(course);
	}
}
