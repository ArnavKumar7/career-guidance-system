package net.codejava;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
	@Query("SELECT l FROM Link l WHERE l.courseid = ?1")
	public Collection<Link> findByCourseId(int id);
}