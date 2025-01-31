package apexon.gs.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import apexon.gs.test.models.Course;
import apexon.gs.test.service.CourceService;

@RestController
public class CourceController {

	@Autowired
	CourceService courceService;

	@PostMapping("/addCource")
	public Course saveCource(@RequestBody Course course) {
		return courceService.saveCource(course);
	}

}
