package com.example.demoweb.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post {
    private String text;
    private int likes;
    private Date creationDate;
    public Post(String text){
        this.text = text;
    }
    public Post(String text, Date date){
        this.text = text;
        creationDate = date;
    }
    public String getText(){
        return text;
    }
    public int getLikes(){
        return likes;
    }
    public Date getDate(){
        return creationDate;
    }
    public void setText(String text){
        this.text = text;
    }
    public void setLikes(int likes){
        this.likes = likes;
    }

}
