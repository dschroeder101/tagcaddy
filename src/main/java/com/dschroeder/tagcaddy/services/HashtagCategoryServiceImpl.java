package com.dschroeder.tagcaddy.services;

import com.dschroeder.tagcaddy.model.HashtagCategory;
import com.dschroeder.tagcaddy.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class HashtagCategoryServiceImpl implements HashtagCategoryService {
    @Override
    public Set<HashtagCategory> findAll() {
        return null;
    }

    @Override
    public HashtagCategory findById(Long aLong) {
        return null;
    }

    @Override
    public HashtagCategory save(HashtagCategory object) {
        return null;
    }

    @Override
    public void delete(HashtagCategory object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<HashtagCategory> findAllByUser(User user) {
        return null;
    }
}
