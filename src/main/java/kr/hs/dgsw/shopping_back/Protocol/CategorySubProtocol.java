package kr.hs.dgsw.shopping_back.Protocol;

import kr.hs.dgsw.shopping_back.Domain.Category;
import kr.hs.dgsw.shopping_back.Domain.SubCategory;
import lombok.Data;

@Data
public class CategorySubProtocol extends SubCategory {

    private String categoryId;

    public CategorySubProtocol(SubCategory s, String categoryId){
        super(s);
        this.categoryId = categoryId;
    }
}
