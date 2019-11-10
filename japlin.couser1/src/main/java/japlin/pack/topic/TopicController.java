package japlin.pack.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
TopicService topicService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hey";
	}
	@RequestMapping(method=RequestMethod.POST,value="/addtopic")
	public void addTopic(@RequestBody Topic topic) {
		
		topicService.addTopic(topic);
	}
	@RequestMapping("/gettopics")
	public List<Topic> getAllTopics() {
		
		return topicService.getAllTopics();
	}
	@RequestMapping(method=RequestMethod.GET,value="/gettopic/{id}")
	public Optional<Topic> getTopic(@PathVariable long id) {
		return topicService.getTopic(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/updatetopic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable long id) {
		
		topicService.updateTopic(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deletetopic/{id}")
	public void deleteTopic(@PathVariable long id) {
		
		topicService.deleteTopic(id);
	}
	
}
