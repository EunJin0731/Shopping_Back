package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Basket;

import java.util.List;

public interface BasketService {

    Basket add(Basket basket);

    boolean delete(Long id);

    List<Basket> listAllBasket();

    Basket update(Long id, Basket basket);
}
