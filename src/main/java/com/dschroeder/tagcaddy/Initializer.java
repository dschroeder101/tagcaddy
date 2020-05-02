package com.dschroeder.tagcaddy;

import com.dschroeder.tagcaddy.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class Initializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final HashtagCategoryRepository hashtagCategoryRepository;
    private final HashtagRepository hashtagRepository;

    public Initializer(UserRepository userRepository, HashtagCategoryRepository hashtagCategoryRepository, HashtagRepository hashtagRepository) {
        this.userRepository = userRepository;
        this.hashtagCategoryRepository = hashtagCategoryRepository;
        this.hashtagRepository = hashtagRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = userRepository.save(new User("Daniel Schroeder"));

        Hashtag hashTag = new Hashtag();
        hashTag.setUser(user);
        hashTag.setHashtag("#hello");
        hashtagRepository.save(hashTag);

        HashtagCategory category = new HashtagCategory();
        category.setCategoryName("Default");
        hashtagCategoryRepository.save(category);

        user.setHashtagCategories(Collections.singletonList(category));
        hashTag.setCategories(Collections.singletonList(category));

        userRepository.save(user);
        hashtagRepository.save(hashTag);
    }
}
