package com.dschroeder.tagcaddy.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;
    private String email;

    @OneToMany
    private List<HashtagCategory> hashtagCategories;

    @OneToMany
    private List<HashtagGroup> hashtagGroups;

    @OneToMany
    private List<Hashtag> hashTags;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<HashtagCategory> getHashtagCategories() {
        return hashtagCategories;
    }

    public void setHashtagCategories(List<HashtagCategory> hashtagCategories) {
        this.hashtagCategories = hashtagCategories;
    }

    public List<HashtagGroup> getHashtagGroups() {
        return hashtagGroups;
    }

    public void setHashtagGroups(List<HashtagGroup> hashtagGroups) {
        this.hashtagGroups = hashtagGroups;
    }

    public List<Hashtag> getHashTags() {
        return hashTags;
    }

    public void setHashTags(List<Hashtag> hashTags) {
        this.hashTags = hashTags;
    }
}
