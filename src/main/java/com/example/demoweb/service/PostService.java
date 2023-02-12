package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        ArrayList<Post> list = new ArrayList<>();
        Post post1 = new Post("1");
        post1.setLikes(576789924);
        Post post2 = new Post("2");
        Post post3 = new Post("3");
        list.add(post1); list.add(post2); list.add(post3);
        return list;
    }
}
