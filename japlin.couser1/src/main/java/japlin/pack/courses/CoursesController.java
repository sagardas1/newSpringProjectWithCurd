package japlin.pack.courses;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {
	@Autowired
CoursesService courseService;
	
	@RequestMapping("/hello2")
	public String hello() {
		return "hey";
	}
	@RequestMapping(method=RequestMethod.POST,value="/addcourse")
	public void addCourse(@RequestBody Courses courses) {
		
		courseService.addCourse(courses);
	}
	@RequestMapping("/getallcourse")
	public List<Courses> getAllCourse() {
		
		return courseService.getAllCouses();
	}
	@RequestMapping(method=RequestMethod.GET,value="/getcourse/{id}")
	public Optional<Courses> getCourse(@PathVariable long id) {
		return courseService.getCourse(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/updatecourse/{id}")
	public void updateCourse(@RequestBody Courses courses,@PathVariable long id) {
		
		courseService.updateCourse(courses,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deletecourse/{id}")
	public void deleteCourse(@PathVariable long id) {
		
		courseService.deleteCourse(id);
	}
	
}
