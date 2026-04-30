import java.util.ArrayList;

public class Simulation{

    private Terrain terrain;
    private ArrayList<Agent> agents;

    public Simulation(Terrain terrain) {
        this.terrain = terrain;
        this.agents = new ArrayList<>();
        agents.add(new Explorateur(terrain, 5, 5));
    }

    public void step(){
        System.out.println("=== STEP ===");
        for (Agent a : agents) {
            a.agir();
        }
    }

    public void run(int steps){
        for (int i=0; i<steps; i++){
            step();

        }
    }
}