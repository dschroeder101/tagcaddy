package com.dschroeder.tagcaddy.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Hashtag implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Id
    private String hashtag;

    @ManyToMany
    private Set<HashtagCategory> categories;

    @ManyToMany
    private Set<HashtagGroup> hashtagGroups;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<HashtagCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<HashtagCategory> categories) {
        this.categories = categories;
    }

    public Set<HashtagGroup> getHashtagGroups() {
        return hashtagGroups;
    }

    public void setHashtagGroups(Set<HashtagGroup> hashtagGroups) {
        this.hashtagGroups = hashtagGroups;
    }
}
