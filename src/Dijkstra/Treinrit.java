package Dijkstra;

public class Treinrit extends Stap {
    private int time;

    public Treinrit(String plaats1, String plaats2) { super(plaats1, plaats2); }

    public void setTime(int time) {
        this.time = time;
    }
}
