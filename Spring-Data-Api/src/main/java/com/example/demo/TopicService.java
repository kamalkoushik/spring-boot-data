package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

@Autowired	
private TopicRepository topicRepository;	

public List<Topic> getAllTopic(){
	 
	List<Topic> topics = new ArrayList<>();
	
     for (Topic item : topicRepository.findAll()) {
    	topics.add(item);
    }
    
    return topics;
 }

public Topic getTopic(String id)
{
 return	topicRepository.findOne(id);
}
	
public void addTopic(Topic topic)
{
	topicRepository.save(topic);
}

public void updateTopic(Topic topic)
{
	topicRepository.save(topic);
}

public void deleteTopic(String id)
{
 topicRepository.delete(id);
}

 
}
