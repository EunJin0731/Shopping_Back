package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.SubCategory;

import java.util.List;
import java.util.Optional;

public interface SubCategoryService {
    List<SubCategory> listAll();
    //List<SubCategory> listAll();
    List getId (Long id);
    Optional<SubCategory> findById(Long id);
}
