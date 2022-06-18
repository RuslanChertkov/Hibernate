package com.teachmeskills.mainApp;

import com.teachmeskills.hibernateintro.model.User;
import com.teachmeskills.hibernateintro.services.BaseService;
import com.teachmeskills.hibernateintro.services.impl.UserServiceImpl;

public class ApplicationDemo {
    public static void main(String[] args) {
        User user = new User("Ruslan", "Chertkov","Minsk",false);
        BaseService<User> service = new UserServiceImpl();
        service.create(user);
    }
}
