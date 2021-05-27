package Dijkstra;

import java.util.PriorityQueue;

public class Rit extends Stap{
    private int kilometers;

    public Rit(String start, String end, PriorityQueue<Stap> costs, int kilometers) {
        super(start, end, costs);
        this.kilometers = kilometers;
    }

    @Override
    public int getValue() {
        return kilometers;
    }

    @Override
    public String toString() {
        return "Rit{" +
                "kilometers=" + kilometers +
                '}';
    }
}

