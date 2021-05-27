package Dijkstra;

import java.util.PriorityQueue;

public class Reis implements Comparable<Reis> {
    private int cost;
    private PriorityQueue<Stap> steps;

    public Reis(int cost, PriorityQueue<Stap> steps) {
        this.cost = cost;
        this.steps = steps;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(Reis reisCost) {
        return 0;
    }
}

