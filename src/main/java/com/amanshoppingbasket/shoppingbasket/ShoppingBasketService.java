package com.amanshoppingbasket.shoppingbasket;

public class ShoppingBasketService {

    private final BasketRepository basketRepository;

    public ShoppingBasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public void addItem(int userId, int productId, int quantity) {

    }

    public Basket basketFor(int userId) {
        return basketRepository.getBaskedForUserId(userId);
    }
}
