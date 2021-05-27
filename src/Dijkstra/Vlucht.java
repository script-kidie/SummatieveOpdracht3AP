package Dijkstra;

public class Vlucht extends Stap {
    public int price;

    public Vlucht(String start, String end, int price) {
        super(start, end);
        this.price = price;
    }

    @Override
    public int getValue() {
        return price;
    }

    @Override
    public String toString() {
        return "Vlucht{" +
                "price=" + price +
                '}';
    }
}

