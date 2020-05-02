package com.dschroeder.tagcaddy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @OneToMany
    private List<HashtagCategory> hashtagCategories;

    @OneToMany
    private List<HashtagGroup> hashtagGroups;

    @OneToMany
    private List<Hashtag> hashTags;
}
