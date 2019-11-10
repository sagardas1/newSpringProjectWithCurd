package japlin.pack.courses;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CoursesRepository extends CrudRepository<Courses,Long>
{
	
	@Query(value="select * from Courses")
	List<Courses> findAll();

	@Transactional
	@Query(value="select * from Courses where id=:id",nativeQuery=true)
	Optional<Courses> findByCourseId(long id);

	@Query(value="UPDATE Courses SET name = :course.getName(), descriprion=:courses.getDescriprion() WHERE id = 1;")
	void updateCourse(Courses courses,long id);

	@Query(value="delete from Courses where id=:id")
	void deleteRequest(long id);
	



	


}


