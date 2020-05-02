package com.dschroeder.tagcaddy.services;

import com.dschroeder.tagcaddy.model.HashtagGroup;
import com.dschroeder.tagcaddy.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HashtagGroupServiceImpl implements HashtagGroupService {
    @Override
    public List<HashtagGroup> findAll() {
        return null;
    }

    @Override
    public HashtagGroup findById(Long id) {
        return null;
    }

    @Override
    public HashtagGroup save(HashtagGroup hashtagGroup) {
        return null;
    }

    @Override
    public void delete(HashtagGroup hashtagGroup) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<HashtagGroup> findAllByUser(User user) {
        return null;
    }
}
