package japlin.pack.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {
	@Autowired
	CoursesRepository cousesRepository;

	public void addCourse(Courses courses) {
		cousesRepository.save(courses);
	}

	public List<Courses> getAllCouses() {

		return  cousesRepository.findAll();
	}

	public Optional<Courses> getCourse(long id) {
		return cousesRepository.findByCourseId(id);
	}

	public void updateCourse(Courses courses, long id) {
		cousesRepository.updateCourse(courses,id);
	}

	public void deleteCourse(long id) {
		cousesRepository.deleteRequest(id);
	}

}
