package service;

import model.User;

import javax.ejb.Stateless;

@Stateless
public class UserService implements IUser {

    @Override
    public User findUser(String username, String password) {
        return null;
    }
}
