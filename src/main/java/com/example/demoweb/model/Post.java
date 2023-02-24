package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    @Id
    @GeneratedValue
    private Long id;

    public Post() {

    }
    public Post(Long id,String text, Date date) {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
    }

    public String getText(){ return text; }

    public Integer getLikes(){ return likes; }

    public Date getCreationDate(){ return creationDate; }
    public Long getId(){ return id; }


    public void setText(String text) {this.text = text;}
    public void setLikes(Integer likes) {this.likes = likes;}
    public void setCreationDate(Date date) {this.creationDate = date;}
    public void setId(long id) { this.id = id;}

}