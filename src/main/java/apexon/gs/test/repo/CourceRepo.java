package apexon.gs.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apexon.gs.test.models.Course;

@Repository
public interface CourceRepo extends JpaRepository<Course, Long>{

}
