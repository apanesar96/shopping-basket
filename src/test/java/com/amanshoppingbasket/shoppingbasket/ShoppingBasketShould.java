package com.amanshoppingbasket.shoppingbasket;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ShoppingBasketShould {

    @Mock
    Printer printer;
    @Mock
    BasketRepository basketRepository;

    @Test
    void add_items_to_shopping_basekt_and_view_contents() {
        Basket mockBasket = new Basket(printer, 1);
        when(basketRepository.getBaskedForUserId(1)).thenReturn(mockBasket);
        ShoppingBasketService shoppingBasketService = new ShoppingBasketService(basketRepository);

        shoppingBasketService.addItem(1, 10001, 2);
        shoppingBasketService.addItem(1, 20110, 5);
        Basket basket = shoppingBasketService.basketFor(1);
        basket.printBasketContents();

        verify(printer).printContents("- Creation date (of the shopping basket)\n" +
                "- 2 x The Hobbit   // 2 x 5.00 = £10.00 \n" +
                "- 5 x Breaking Bad // 5 x 7.00 = £35.00\n" +
                "- Total: £45.00");
    }
}
