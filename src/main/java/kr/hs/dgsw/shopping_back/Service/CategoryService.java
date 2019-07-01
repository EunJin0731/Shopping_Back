package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Category;
import kr.hs.dgsw.shopping_back.Domain.SubCategory;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> listAll();
    Optional<Category> findById(Long id);
}
