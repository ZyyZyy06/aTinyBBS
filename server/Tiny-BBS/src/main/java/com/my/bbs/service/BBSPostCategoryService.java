
package com.my.bbs.service;

import com.my.bbs.entity.BBSPostCategory;

import java.util.List;

public interface BBSPostCategoryService {

    List<BBSPostCategory> getBBSPostCategories();

    BBSPostCategory selectById(Integer categoryId);
}
