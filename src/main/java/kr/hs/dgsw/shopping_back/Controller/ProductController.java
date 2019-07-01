package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Product;
import kr.hs.dgsw.shopping_back.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> list(){
        return this.productService.listAllProduct();
    }

    @PostMapping("/addProduct")
    public Product add(@RequestBody Product product){
        return this.productService.addProduct(product);
    }

    @GetMapping("/product/category/{id}")
    public List Category(@PathVariable Long id){
        return this.productService.findByCategoryId(id);
    }

    @GetMapping("/product/subcategory/{id}")
    public List SubCategory(@PathVariable Long id){
        return this.productService.findBySubId(id);
    }
}
