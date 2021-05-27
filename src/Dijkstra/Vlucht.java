package Dijkstra;

public class Vlucht extends Stap {
    public int price;

    public Vlucht(String start, String plaats2) {
        super(start, plaats2);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
