package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Category;
import kr.hs.dgsw.shopping_back.Domain.SubCategory;
import kr.hs.dgsw.shopping_back.Protocol.CategorySubProtocol;
import kr.hs.dgsw.shopping_back.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

    @GetMapping("/subcategory/{id}")
    public List<SubCategory> getId(@PathVariable Long id){
        return this.subCategoryService.getId(id);
    }

    @GetMapping("/subcategory")
    public List<SubCategory> listAll(){
        return this.subCategoryService.listAll();
    }
}
