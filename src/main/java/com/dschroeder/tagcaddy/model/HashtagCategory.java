package com.dschroeder.tagcaddy.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class HashtagCategory implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private Set<Hashtag> hashtags;

    @Id
    private String categoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
