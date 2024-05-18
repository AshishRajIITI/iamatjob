package org.example.secondProject.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topicList = new ArrayList<>( Arrays.asList(new Topic("1", "ashish"),
            new Topic("2", "dhruv"),
            new Topic("3","akash")));

    public List<Topic> getAllTopics(){
        return topicList;
    }
    public Topic getTopic(String id){
        return topicList.stream().filter(x->x.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topicList.add(topic);
    }

    public void updateTopic(Topic topic, String id){
        for(int i=0; i<topicList.size(); i++){
            if(topicList.get(i).getId().equals(id)){
                topicList.set(i, topic);
                return;
            }
        }
    }
}
