package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.SubCategory;
import kr.hs.dgsw.shopping_back.Protocol.CategorySubProtocol;
import kr.hs.dgsw.shopping_back.Repository.CategoryRepository;
import kr.hs.dgsw.shopping_back.Repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    /*@Override
    public List<CategorySubProtocol> listAll() {
        List<SubCategory> list = this.subCategoryRepository.findAll();
        List<CategorySubProtocol> csplist = new ArrayList<>();

        list.forEach(subCategory -> {
            csplist.add(new CategorySubProtocol(subCategory, this.categoryRepository.findById(subCategory.getCategoryId())
                    .map(c->c.getName())
                    .orElse(null)));
        });

        return csplist;
    }*/

    @Override
    public List<SubCategory> listAll() {
        return this.subCategoryRepository.findAll();
    }

    @Override
    public List getId(Long id) {
        return this.subCategoryRepository.findByCategoryId(id);
    }

    @Override
    public Optional<SubCategory> findById(Long id) {
        return this.subCategoryRepository.findById(id);
    }
}
