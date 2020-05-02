package com.dschroeder.tagcaddy.services;

import com.dschroeder.tagcaddy.model.HashtagGroup;
import com.dschroeder.tagcaddy.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class HashtagGroupServiceImpl implements HashtagGroupService {
    @Override
    public Set<HashtagGroup> findAll() {
        return null;
    }

    @Override
    public HashtagGroup findById(Long aLong) {
        return null;
    }

    @Override
    public HashtagGroup save(HashtagGroup object) {
        return null;
    }

    @Override
    public void delete(HashtagGroup object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<HashtagGroup> findAllByUser(User user) {
        return null;
    }
}
