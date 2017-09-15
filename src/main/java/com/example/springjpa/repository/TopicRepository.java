package com.example.springjpa.repository;

import com.example.springjpa.domain.Topic;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashoksurya on 15-09-2017.
 */
public interface TopicRepository extends CrudRepository<Topic,Long>{
}
