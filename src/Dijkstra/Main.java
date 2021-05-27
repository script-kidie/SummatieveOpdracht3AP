package Dijkstra;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Stap> queue1 = new PriorityQueue<Stap>();


        Vlucht v1 = new Vlucht("am","lo",queue1,100);
        Vlucht v2 = new Vlucht("am","lo",queue1,144);
        Vlucht v3 = new Vlucht("am","lo",queue1,166);
        Vlucht v4 = new Vlucht("am","lo",queue1,122);

        queue1.add(v1);
        queue1.add(v1);
        queue1.add(v1);
        queue1.add(v1);

        System.out.println(queue1);
    }
}
