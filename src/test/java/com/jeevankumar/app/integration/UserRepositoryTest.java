package com.jeevankumar.app.integration;

import com.jeevankumar.app.entity.User;
import com.jeevankumar.app.repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    void saveUserTest() {
        User user = repository.save(new User("Jeevan"));
        assertThat(user.getName()).isEqualTo("Jeevan");
        assertThat(user.getId()).isNotNull();
    }
}
