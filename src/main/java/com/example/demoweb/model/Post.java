package com.example.demoweb.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private String text;
    private int likes;
    public Post(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public int getLikes(){
        return likes;
    }
    public void setText(String text){
        this.text = text;
    }
    public void setLikes(int likes){
        this.likes = likes;
    }
}
