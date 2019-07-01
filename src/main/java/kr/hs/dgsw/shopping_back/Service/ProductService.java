package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProduct();

    Product addProduct(Product product);

    List findByCategoryId(Long id);

    List findBySubId(Long id);
}
