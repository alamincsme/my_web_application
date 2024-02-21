package com.alamincse.main.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Long countById(Integer id);

    public List<User> findByFirstNameContainingOrLastNameContainingOrEmailContaining(String firstName, String lastName, String email);

}
