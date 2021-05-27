package Dijkstra;

import junit.framework.TestCase;

import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class ReisTest extends TestCase {

    public void testValidVluchtClass() {
        PriorityQueue<Stap> s1r1 = new PriorityQueue<>();
        PriorityQueue<Stap> s2r1 = new PriorityQueue<>();

        Vlucht s1v1 = new Vlucht("am","lo", 144);
        Vlucht s1v2 = new Vlucht("am","lo", 100);
        Vlucht s1v3 = new Vlucht("am","lo", 177);

        Vlucht s2v1 = new Vlucht("lo","mo", 166);
        Vlucht s2v2 = new Vlucht("lo","mo", 122);
        Vlucht s2v3 = new Vlucht("lo","mo", 133);

        s1r1.add(s1v1);
        s1r1.add(s1v2);
        s1r1.add(s1v3);

        s2r1.add(s2v1);
        s2r1.add(s2v2);
        s2r1.add(s2v3);

        Reis r1 = new Reis(s1r1);

        r1.setCost(0);

        r1.setCost(r1.compareTo(s1r1) + r1.getCost());
        r1.setCost(r1.compareTo(s2r1) + r1.getCost());

        assertEquals(222, r1.getCost());
    }

    public void testValidRitClass() {
        PriorityQueue<Stap> s1r1 = new PriorityQueue<>();
        PriorityQueue<Stap> s2r1 = new PriorityQueue<>();

        Rit s1v1 = new Rit("am","lo", 145);
        Rit s1v2 = new Rit("am","lo", 100);
        Rit s1v3 = new Rit("am","lo", 45);

        Rit s2v1 = new Rit("lo","mo", 162);
        Rit s2v2 = new Rit("lo","mo", 122);

        s1r1.add(s1v1);
        s1r1.add(s1v2);
        s1r1.add(s1v3);

        s2r1.add(s2v1);
        s2r1.add(s2v2);

        Reis r1 = new Reis(s1r1);

        r1.setCost(0);

        r1.setCost(r1.compareTo(s1r1) + r1.getCost());
        r1.setCost(r1.compareTo(s2r1) + r1.getCost());

        assertEquals(167, r1.getCost());
    }

    public void testValidTreinritClass() {
        PriorityQueue<Stap> s1r1 = new PriorityQueue<>();
        PriorityQueue<Stap> s2r1 = new PriorityQueue<>();

        Treinrit s1v1 = new Treinrit ("am","lo", 500);
        Treinrit s1v2 = new Treinrit ("am","lo", 77);

        Treinrit s2v1 = new Treinrit ("lo","mo", 186);
        Treinrit s2v2 = new Treinrit ("lo","mo", 122);

        s1r1.add(s1v1);
        s1r1.add(s1v2);

        s2r1.add(s2v1);
        s2r1.add(s2v2);

        Reis r1 = new Reis(s1r1);

        r1.setCost(0);

        r1.setCost(r1.compareTo(s1r1) + r1.getCost());
        r1.setCost(r1.compareTo(s2r1) + r1.getCost());

        assertEquals(199, r1.getCost());

    }

    public void testEmptyPQ() {
        PriorityQueue<Stap> s1r1 = new PriorityQueue<>();
        PriorityQueue<Stap> s2r1 = new PriorityQueue<>();

        Vlucht s1v1 = new Vlucht("am","lo", 144);
        Vlucht s1v2 = new Vlucht("am","lo", 100);

        Vlucht s2v1= new Vlucht("lo","mo", 166);
        Vlucht s2v2 = new Vlucht("lo","mo", 122);

        s2r1.add(s2v1);
        s2r1.add(s2v2);

        Reis r1 = new Reis(s1r1);

        assertEquals(21, r1.compareTo(s1r1)); //code returns 21 if the PQ is empty
    }

    public void testManySteps() {
        PriorityQueue<Stap> s1r1 = new PriorityQueue<>();
        PriorityQueue<Stap> s2r1 = new PriorityQueue<>();
        PriorityQueue<Stap> s3r1 = new PriorityQueue<>();
        PriorityQueue<Stap> s4r1 = new PriorityQueue<>();

        Treinrit s1t1 = new Treinrit ("am","lo", 3);
        Treinrit s1t2 = new Treinrit ("am","lo", 2);
        Treinrit s1t3 = new Treinrit ("lo","mo", 6);
        Treinrit s1t4 = new Treinrit ("lo","mo", 5);
        Treinrit s1t5 = new Treinrit ("lo","mo", 8);

        Treinrit s2t1 = new Treinrit ("lo","mo", 2);
        Treinrit s2t2 = new Treinrit ("lo","mo", 1);
        Treinrit s2t3 = new Treinrit ("lo","mo", 3);

        Treinrit s3t1 = new Treinrit ("am","lo", 6);
        Treinrit s3t2 = new Treinrit ("am","lo", 6);

        Treinrit s4t1 = new Treinrit ("am","lo", 3);
        Treinrit s4t2 = new Treinrit ("am","lo", 2);

        s1r1.add(s1t1);
        s1r1.add(s1t2);
        s1r1.add(s1t3);
        s1r1.add(s1t4);
        s1r1.add(s1t5);

        s2r1.add(s2t1);
        s2r1.add(s2t2);
        s2r1.add(s2t3);

        s3r1.add(s3t1);
        s3r1.add(s3t2);

        s4r1.add(s4t1);
        s4r1.add(s4t2);

        Reis r1 = new Reis(s1r1);

        r1.setCost(0);

        r1.setCost(r1.compareTo(s1r1) + r1.getCost());
        r1.setCost(r1.compareTo(s2r1) + r1.getCost());
        r1.setCost(r1.compareTo(s3r1) + r1.getCost());
        r1.setCost(r1.compareTo(s4r1) + r1.getCost());

        assertEquals(11, r1.getCost());
    }
}