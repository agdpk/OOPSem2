package org.example;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Petr");
        market.acceptToMarket(human1);
        market.update();
    }
}