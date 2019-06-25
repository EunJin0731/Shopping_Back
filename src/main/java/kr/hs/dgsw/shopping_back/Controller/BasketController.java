package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Basket;
import kr.hs.dgsw.shopping_back.Service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasketController {

    @Autowired
    private BasketService basketService;

    @PostMapping("/addBasket")
    public Basket add(@RequestBody Basket basket){
        return this.basketService.add(basket);
    }

    @DeleteMapping("/deleteBasket/{id}")
    public boolean delete(@PathVariable Long id){
        return this.basketService.delete(id);
    }

    @GetMapping("/basket")
    public List<Basket> list(){
        return this.basketService.listAllBasket();
    }

    @PutMapping("/updateBasket/{id}")
    public Basket update(@PathVariable Long id,@RequestBody Basket basket){
        return this.basketService.update(id, basket);
    }
}
