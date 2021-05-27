package Dijkstra;

public class Rit extends Stap{
    private int kilometers;

    public Rit(String start, String end, int kilometers) {
        super(start, end);
        this.kilometers = kilometers;
    }

    @Override
    public int getValue() {
        return kilometers;
    }

    @Override
    public String toString() {
        return "Rit{" +
                "kilometers=" + kilometers +
                '}';
    }
}

