package Dijkstra;

import java.util.PriorityQueue;

public abstract class Stap implements Comparable<Stap>{
    private String start;
    private String end;
    private PriorityQueue<Stap> costs;


    public Stap(String start, String end, PriorityQueue<Stap> costs) {
        this.start = start;
        this.end = end;
        this.costs = costs;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public abstract int getValue();

    @Override
    public int compareTo(Stap stapCost){
        return 0;
    }

    @Override
    public String toString() {
        return "Stap{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", costs=" + costs +
                '}';
    }
}

