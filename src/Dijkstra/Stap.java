package Dijkstra;

public class Stap {
    private int kilometers;
    private int time;
    private float price;

    public Stap(int kilometers, int time, float price) {
        this.kilometers = kilometers;
        this.time = time;
        this.price = price;
    }

    public int getKilometers() {
        return kilometers;
    }

    public int getTime() {
        return time;
    }

    public float getPrice() {
        return price;
    }
}
