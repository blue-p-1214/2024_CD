package com.CD2024.smarTravel.user.model.service;


import com.CD2024.smarTravel.user.model.dto.User;

public interface UserService {
    User login(String id, String password);
    boolean join(User user);
    boolean leave(String id);

    boolean modifiy(User user);
}
