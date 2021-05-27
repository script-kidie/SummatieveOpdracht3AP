package Dijkstra;

import java.util.PriorityQueue;

public class Vlucht extends Stap {
    public int price;

    public Vlucht(String start, String end, PriorityQueue<Stap> costs, int price) {
        super(start, end, costs);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int getValue() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Vlucht{" +
                "price=" + price +
                '}';
    }
}

