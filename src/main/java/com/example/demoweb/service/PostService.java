package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        ArrayList<Post> list = new ArrayList<>();

        Post post1 = new Post("1", Date.from(Instant.now()));
        post1.setLikes(576789924);
        Post post2 = new Post("2", Date.from(Instant.now()));
        Post post3 = new Post("3", Date.from(Instant.now()));
        list.add(post1); list.add(post2); list.add(post3);
        return list;
    }
}
