package com.dschroeder.tagcaddy.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hashtag{

    @Id
    @GeneratedValue
    private Long id;

    private String hashtag;

    @ManyToMany
    private List<HashtagCategory> categories;

    @ManyToMany
    private List<HashtagGroup> hashtagGroups;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<HashtagCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<HashtagCategory> categories) {
        this.categories = categories;
    }

    public List<HashtagGroup> getHashtagGroups() {
        return hashtagGroups;
    }

    public void setHashtagGroups(List<HashtagGroup> hashtagGroups) {
        this.hashtagGroups = hashtagGroups;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
