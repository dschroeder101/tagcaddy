package com.dschroeder.tagcaddy.services;

import com.dschroeder.tagcaddy.model.User;
import com.dschroeder.tagcaddy.model.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
