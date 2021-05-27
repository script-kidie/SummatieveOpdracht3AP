package Dijkstra;

public class Treinrit extends Stap {
    private int time;

    public Treinrit(String start, String end, int time) {
        super(start, end);
        this.time = time;
    }

    @Override
    public int getValue() {
        return time;
    }

    @Override
    public String toString() {
        return "Treinrit{" +
                "time=" + time +
                '}';
    }
}
