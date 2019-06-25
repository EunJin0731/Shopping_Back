package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Basket;
import kr.hs.dgsw.shopping_back.Repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasketServiceImpl implements BasketService{

    @Autowired
    private BasketRepository basketRepository;


    @Override
    public Basket add(Basket basket) {
        return this.basketRepository.save(basket);
    }

    @Override
    public boolean delete(Long id) {
        try{
            this.basketRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Basket> listAllBasket() {
        List<Basket> basketList = this.basketRepository.findAll();
        return basketList;
    }

    @Override
    public Basket update(Long id, Basket basket) {
        return this.basketRepository.findById(id)
                .map(found ->{
                    found.setId(Optional.ofNullable(basket.getId()).orElse(found.getId()));
                    found.setProduct(Optional.ofNullable(basket.getProduct()).orElse(found.getProduct()));
                    found.setCount(Optional.ofNullable(basket.getCount()).orElse(found.getCount()));
                    found.setPrice(Optional.ofNullable(basket.getPrice()).orElse(found.getPrice()));
                    found.setTotal(Optional.ofNullable(basket.getTotal()).orElse(found.getTotal()));
                    return this.basketRepository.save(found);
                })
                .orElse(null);
    }
}
