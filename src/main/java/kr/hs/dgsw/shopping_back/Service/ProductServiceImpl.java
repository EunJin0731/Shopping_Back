package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

}
