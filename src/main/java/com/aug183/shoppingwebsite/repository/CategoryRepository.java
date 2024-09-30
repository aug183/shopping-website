package com.aug183.shoppingwebsite.repository;

import com.aug183.shoppingwebsite.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
