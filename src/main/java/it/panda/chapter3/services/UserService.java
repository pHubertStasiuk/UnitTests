package it.panda.chapter3.services;

import it.panda.chapter3.model.SignUpRequest;
import it.panda.chapter3.model.User;

public interface UserService<T extends User> {


    User save(SignUpRequest signUp);

    T findByUserID(String userID);

    T findUserByEmail(String email);

    boolean blockAccount(String userID);

    boolean grantPermission(String userID, String role);

    boolean removePermission(String userID, String role);

    boolean deleteUser(String userID);

}
