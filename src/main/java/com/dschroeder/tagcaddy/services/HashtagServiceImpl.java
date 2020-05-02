package com.dschroeder.tagcaddy.services;

import com.dschroeder.tagcaddy.model.Hashtag;
import com.dschroeder.tagcaddy.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class HashtagServiceImpl implements HashtagService{
    @Override
    public Set<Hashtag> findAll() {
        return null;
    }

    @Override
    public Hashtag findById(Long aLong) {
        return null;
    }

    @Override
    public Hashtag save(Hashtag object) {
        return null;
    }

    @Override
    public void delete(Hashtag object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Hashtag> findAllByUser(User user) {
        return null;
    }
}
