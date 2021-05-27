package Dijkstra;

import java.util.PriorityQueue;

public class Reis implements Comparable<PriorityQueue<Stap>> {
    private int cost;

    public Reis(PriorityQueue<Stap> steps) {
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(PriorityQueue<Stap> steps){
        Stap current = steps.poll(); //fetches the first step from the PQ
        if(current == null){ //checks if the Pq is empty
            System.out.println("deze reis in niet mogelijk");
            return 21; // return 21 because its fun
        } else {
            for (Stap s : steps) {
                if (s.getValue() < current.getValue()) { // determine if the value of the current step is higher then the original
                    current = s; // make the current step the one whe want to return
                }
            }

        }
        return current.getValue();
    }
}

