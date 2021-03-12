package service;

import model.User;

import javax.ejb.Local;

@Local
public interface IUser {
    public User findUser(String username, String password);
}
