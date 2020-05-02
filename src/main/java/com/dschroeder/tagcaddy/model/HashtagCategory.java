package com.dschroeder.tagcaddy.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class HashtagCategory {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private List<Hashtag> hashtags;

    private String categoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
