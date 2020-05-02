package com.dschroeder.tagcaddy.services;

import com.dschroeder.tagcaddy.model.User;

import java.util.List;

public interface RetrieveByUserService<T> {
    List<T> findAllByUser(User user);
}
