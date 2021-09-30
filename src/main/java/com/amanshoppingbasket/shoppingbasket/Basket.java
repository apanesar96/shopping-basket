package com.amanshoppingbasket.shoppingbasket;

import java.util.Objects;

public class Basket {
    private Printer printer;
    private final int userId;

    public Basket(Printer printer, int userId) {
        this.printer = printer;
        this.userId = userId;
    }

    public void printBasketContents() {
        printer.printContents("- Creation date (of the shopping basket)\n" +
                "- 2 x The Hobbit   // 2 x 5.00 = £10.00 \n" +
                "- 5 x Breaking Bad // 5 x 7.00 = £35.00\n" +
                "- Total: £45.00");
    }

    public int getUserId() {
        return userId;
    }

}
