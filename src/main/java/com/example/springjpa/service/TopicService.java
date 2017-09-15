package com.example.springjpa.service;

import com.example.springjpa.domain.Topic;
import com.example.springjpa.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashoksurya on 15-09-2017.
 */
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
}
