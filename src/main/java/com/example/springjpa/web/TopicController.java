package com.example.springjpa.web;

import com.example.springjpa.domain.Topic;
import com.example.springjpa.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ashoksurya on 15-09-2017.
 */
@RestController
@RequestMapping("/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping(produces = "application/json")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @PostMapping(consumes = "application/json" )
    public void addTopic(@RequestBody  Topic topic){
        topicService.addTopic(topic);
    }
}
