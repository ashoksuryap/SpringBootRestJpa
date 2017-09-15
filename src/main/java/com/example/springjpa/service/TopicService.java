package com.example.springjpa.service;

import com.example.springjpa.domain.Topic;
import com.example.springjpa.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public Topic getTopicById(Long id) {
        return topicRepository.findOne(id);
    }

    public void updateTopic(long id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(Long id) {
        topicRepository.delete(id);
    }
}
