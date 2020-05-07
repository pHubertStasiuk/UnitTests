package it.panda.chapter3.repository;

import it.panda.chapter3.model.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findByEmail(String email);

    Optional<User> findByUserId(String userId);

    Boolean existsByEmail(String email);

    Boolean existsByUserId(String userId);

    Optional<User> findByEmailToken(String token);
}
