package com.nastya.images.dao;

import com.nastya.images.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ImageDao extends JpaRepository<ImageEntity, UUID> {

    void deleteByFrontId(String frontId);
}
