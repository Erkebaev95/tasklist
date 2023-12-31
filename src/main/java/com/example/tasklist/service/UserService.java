package com.example.tasklist.service;

import com.example.tasklist.domain.user.User;

public interface UserService {

    User getById(Long id);
    User getByUsername(String username);
    User update(User user);
    User create(User user);
    void delete(Long id);
    boolean isTaskOwner(Long userId, Long taskId);
}