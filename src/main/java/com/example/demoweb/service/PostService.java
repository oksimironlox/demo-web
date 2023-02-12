package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

@Service
public class PostService {

    List<Post> posts = new ArrayList<>() {{
        add(new Post(0, "1", new Date()));
        add(new Post(1, "2", new Date()));
        add(new Post(2, "3", new Date()));
    }};


    public List<Post> listAllPosts() {
        return posts;
    }

    public void createPost(String text){
        posts.add(new Post(posts.size(), text, new Date()));
    }
}
