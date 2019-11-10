package japlin.pack.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	
	private String name;
	@Id
	private long id;
	private String description;
	

	public Courses() {
		
	}
	
	public Courses(String name, long id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
		

}
