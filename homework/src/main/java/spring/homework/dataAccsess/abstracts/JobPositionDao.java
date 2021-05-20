package spring.homework.dataAccsess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.homework.entities.concreate.JobPosition;
//JpaRepostory add delete gibi işlemleri otamatik ekliyor
public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{

}
