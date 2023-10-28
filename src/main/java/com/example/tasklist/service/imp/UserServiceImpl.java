package com.example.tasklist.service.imp;

import com.example.tasklist.domain.user.Task;
import com.example.tasklist.domain.user.User;
import com.example.tasklist.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public boolean isTaskOwner(Long userId, Task taskId) {
        return false;
    }
}
