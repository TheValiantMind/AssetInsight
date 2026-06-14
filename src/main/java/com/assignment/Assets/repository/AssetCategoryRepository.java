/**
 * Copyright (c) 2026 V K Deewakar. All Rights Reserved.
 */
package com.assignment.Assets.repository;

import com.assignment.Assets.model.AssetCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetCategoryRepository extends JpaRepository<AssetCategory, Long> {

    boolean existsByNameIgnoreCase(String name);
}
