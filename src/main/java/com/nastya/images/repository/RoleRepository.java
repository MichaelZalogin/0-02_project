package com.nastya.images.repository;

import com.nastya.images.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<RoleEntity, UUID> {

}