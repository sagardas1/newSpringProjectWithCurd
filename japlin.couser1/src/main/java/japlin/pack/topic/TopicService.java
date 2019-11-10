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
