package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Product;
import kr.hs.dgsw.shopping_back.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> listAllProduct() {
        List<Product> productList = this.productRepository.findAll();
        return productList;
    }

    @Override
    public Product addProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public List findByCategoryId(Long id) {
        //return this.productRepository.findByCategory(id);
        return null;
    }

    @Override
    public List findBySubId(Long id) {
        //return this.productRepository.findBySubCategory(id);
        return null;
    }
}
