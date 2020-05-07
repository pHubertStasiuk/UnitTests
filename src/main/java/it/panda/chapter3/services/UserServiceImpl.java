package it.panda.chapter3.services;

import it.panda.chapter3.model.SignUpRequest;
import it.panda.chapter3.model.User;

public class UserServiceImpl implements UserService<User> {

    @Override
    public User save(SignUpRequest signUp) {
        return null;
    }

    @Override
    public User findByUserID(String userID) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public boolean blockAccount(String userID) {
        return false;
    }

    @Override
    public boolean grantPermission(String userID, String role) {
        return false;
    }

    @Override
    public boolean removePermission(String userID, String role) {
        return false;
    }

    @Override
    public boolean deleteUser(String userID) {
        return false;
    }
}
