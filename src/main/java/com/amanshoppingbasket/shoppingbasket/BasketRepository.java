package com.amanshoppingbasket.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class BasketRepository {
    private List<Basket> baskets = new ArrayList<Basket>();

    public BasketRepository(List<Basket> baskets) {

        this.baskets = baskets;
    }

    public BasketRepository() {

    }

    public Basket getBaskedForUserId(int userId) {
        for(Basket basket : baskets){
            if(basket.getUserId() == userId){
                return basket;
            }
        }
        Basket newBasket = new Basket(new Printer(), userId);
        baskets.add(newBasket);
        return newBasket;

    }

    public List<Basket> getAllBaskets() {
        return this.baskets;
    }
}
