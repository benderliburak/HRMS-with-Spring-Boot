package spring.homework.business.abstracts;

import java.util.List;

import spring.homework.entities.concreate.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
	
	
}
