package Dijkstra;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Stap> queue1 = new PriorityQueue<Stap>();
        PriorityQueue<Stap> queue2 = new PriorityQueue<Stap>();


        Vlucht s1v1 = new Vlucht("am","lo", 144);
        Vlucht s1v2 = new Vlucht("am","lo", 100);
        Vlucht s2v1= new Vlucht("lo","mo", 166);
        Vlucht s2v2 = new Vlucht("lo","mo", 122);



        queue1.add(s1v1);
        queue1.add(s1v2);

        queue2.add(s2v1);
        queue2.add(s2v2);

        System.out.println(queue1);
        System.out.println(queue2);
    }
}
