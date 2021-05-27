package Dijkstra;

import java.util.PriorityQueue;

public abstract class Stap implements Comparable{
    private String start;
    private String end;

    public Stap(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public abstract int getValue();

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Stap{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}

