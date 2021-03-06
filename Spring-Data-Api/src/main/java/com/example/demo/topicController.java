package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class topicController {

	
	@Autowired
	private TopicService service;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
	 return	service.getAllTopic();
	}
     
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return service.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		 service.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		 service.deleteTopic(id);
	}
}
