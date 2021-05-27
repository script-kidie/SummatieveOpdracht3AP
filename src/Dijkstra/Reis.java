package Dijkstra;

import java.util.HashMap;

public class Reis implements Comparable{
    private int cost;
    private HashMap<String, Stap> steps;

    public Reis(HashMap<String, Stap> steps) {
        this.steps = steps;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(Object cost) {
        return 0;
    }
}
