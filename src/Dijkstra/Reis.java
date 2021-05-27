package Dijkstra;

import java.util.PriorityQueue;

public class Reis implements Comparable<PriorityQueue<Stap>> {
    private int cost;
    private PriorityQueue<Stap> steps;

    public Reis(PriorityQueue<Stap> steps) {
        this.steps = steps;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



    @Override
    public int compareTo(PriorityQueue<Stap> steps){
        System.out.println(steps);
        Stap current = steps.poll();
        if(current == null){
            System.out.println("er is geen verbinding tussen "+ current.getStart() +" en "+ current.getEnd());
            return 21;
        } else {
            for (Stap s : steps) {
                if (s.getValue() < current.getValue()) {
                    current = s;
                }
            }
            return current.getValue();
        }
    }
}

