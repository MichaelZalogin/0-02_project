package com.nastya.images.repository;

import com.nastya.images.NastyaAppTests;
import com.nastya.images.entity.RoleEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserEntityDaoTest extends NastyaAppTests {
    @Autowired
    private RoleRepository roleRepository;

    @Test
    void saveTest() {

        RoleEntity role = new RoleEntity();
        role.setName("role233");

        RoleEntity role2 = roleRepository.save(role);

        Assertions.assertNotNull(role2);

    }
}