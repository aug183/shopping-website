package com.aug183.shoppingwebsite.service.category;

import com.aug183.shoppingwebsite.model.Category;

import java.util.List;

public interface ICategoryService {
    Category getCategoryByID(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category);
    void deleteCategoryById(Long id);
}
