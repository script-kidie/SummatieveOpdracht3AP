package Dijkstra;

import java.util.PriorityQueue;

public class Treinrit extends Stap {
    private int time;

    public Treinrit(String start, String end, PriorityQueue<Stap> costs, int time) {
        super(start, end, costs);
        this.time = time;
    }

    public int getTime() {
        return time;
    }
    @Override
    public int getValue() {
        return getTime();
    }

    @Override
    public String toString() {
        return "Treinrit{" +
                "time=" + time +
                '}';
    }
}
