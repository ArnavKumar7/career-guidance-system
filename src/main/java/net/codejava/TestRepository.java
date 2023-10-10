package net.codejava;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
	@Query("SELECT t FROM Test t WHERE t.courseid = ?1")
	public Collection<Test> findByCourseId(int id);
	
	@Query("SELECT t FROM Test t WHERE t.questionid= ?1")
	public Collection<Test> findByQuestionId(int id);
}
