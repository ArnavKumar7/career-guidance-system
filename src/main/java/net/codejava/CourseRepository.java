package net.codejava;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
	@Query("SELECT c FROM Course c WHERE c.deptid = ?1")
	public Collection<Course> findByDeptId(int id);
}

