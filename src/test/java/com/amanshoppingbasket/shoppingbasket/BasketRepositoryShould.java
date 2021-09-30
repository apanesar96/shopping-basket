package com.amanshoppingbasket.shoppingbasket;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BasketRepositoryShould {

    @Test
    void create_basket_for_user_if_it_does_not_exist() {
        Basket expectedBasket = new Basket(new Printer(), 1);

        BasketRepository basketRepository = new BasketRepository();
        basketRepository.getBaskedForUserId(1);

        List<Basket> actualBaskets = basketRepository.getAllBaskets();

        assertEquals(expectedBasket.getUserId(),actualBaskets.get(0).getUserId());
        assertEquals(1,actualBaskets.size());
    }

    @Test
    void retrieve_basket_for_user_id_1() {
        Basket expectedBasket = new Basket(new Printer(), 1);
        List<Basket> existingBaskets = new ArrayList<>();
        existingBaskets.add(expectedBasket);
        BasketRepository basketRepository = new BasketRepository(existingBaskets);
        Basket actualBasket = basketRepository.getBaskedForUserId(1);

        assertEquals(expectedBasket, actualBasket);
    }
}
