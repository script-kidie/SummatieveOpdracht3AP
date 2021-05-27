package Dijkstra;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Stap> s1r1 = new PriorityQueue<>();
        PriorityQueue<Stap> s2r1 = new PriorityQueue<>();


        Vlucht s1v1 = new Vlucht("am","lo", 144);
        Vlucht s1v2 = new Vlucht("am","lo", 100);
        Vlucht s2v1= new Vlucht("lo","mo", 166);
        Vlucht s2v2 = new Vlucht("lo","mo", 122);



        s1r1.add(s1v1);
        s1r1.add(s1v2);

        s2r1.add(s2v1);
        s2r1.add(s2v2);

        Reis r1 = new Reis(s1r1);

        r1.setCost(0);
        r1.setCost(r1.compareTo(s1r1) + r1.getCost());
        r1.setCost(r1.compareTo(s2r1) + r1.getCost());


    }
}
