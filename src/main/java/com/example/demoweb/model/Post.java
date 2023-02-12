package com.example.demoweb.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private long id;
    public Post(String text){
        this.text = text;
        likes = 0;
    }
    public Post(long id, String text, Date date){
        this.id = id;
        this.text = text;
        creationDate = date;
        likes = 0;
    }
    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getDate(){
        return creationDate;
    }
    public long getId(){
        return id;
    }
    public void setText(String text){
        this.text = text;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }

}
