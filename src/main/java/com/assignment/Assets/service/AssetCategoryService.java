/**
 * Copyright (c) 2026 V K Deewakar. All Rights Reserved.
 */
package com.assignment.Assets.service;

import com.assignment.Assets.model.AssetCategory;

import java.util.List;

public interface AssetCategoryService {

    AssetCategory createCategory(AssetCategory assetCategory);

    List<AssetCategory> fetchAllCategories();

    AssetCategory updateCategory(AssetCategory assetCategory, Long categoryId);
}
