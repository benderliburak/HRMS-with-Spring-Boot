package spring.homework.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import spring.homework.business.abstracts.JobPositionService;
import spring.homework.entities.concreate.JobPosition;

@RestController
@RequestMapping("api/jobposition")
public class JobPositionController {
	private final JobPositionService jobPositionService;
@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return jobPositionService.getAll();		
	}
	
	
	
}
