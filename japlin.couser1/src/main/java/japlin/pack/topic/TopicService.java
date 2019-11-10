package japlin.pack.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	TopicRepository topicRepository;
	
	
	List<Topic> topicsList=new ArrayList<Topic>(Arrays.asList(
			new Topic("java",1,"opps descriotions"),
			new Topic("spring",2,"Spring framework descriotions"),
			new Topic("python",3,"python  descriotions")
			));



	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}



	public List<Topic> getAllTopics() {
		
		return (List<Topic>) topicRepository.findAll();
	}



	public Optional<Topic> getTopic(long id) {
	return topicRepository.findById(id);
	}



	public void updateTopic(Topic topic, long id) {
		topicRepository.save(topic);
	}



	public void deleteTopic(long id) {
		topicRepository.deleteById(id);	
	}

}
