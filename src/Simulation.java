import java.util.ArrayList;

public class Simulation {

    private Terrain terrain;
    private ArrayList<Agent> agents;

    public Simulation(Terrain terrain) {
        this.terrain = terrain;
        this.agents = new ArrayList<>();
        //les agents
        agents.add(new Explorateur(terrain, 0, 0));
        agents.add(new Explorateur(terrain, 1, 1));
        //les ressources sur le terrain
        terrain.setCase(8, 8, new Tresor(100));
        terrain.setCase(2,2, new Algue(5));
        terrain.setCase(5,7, new Algue(2));
    }

    public void step() {
        System.out.println("=== ETAPE DE SIMULATION ===");
        for (Agent a : agents) {
            a.agir();
        }
    }

    public void run(int steps) {
        for (int i = 0; i < steps; i++) {
            step();
        }
    }

    //déplacement des ressources
    public void deplacerRessourcesAleatoirement(int intensite) {

        for (int i = 0; i < ressources.size(); i++) {

            Ressource r = ressources.get(i);

            int x = (int)(Math.random() * 5 + 1);
            int y = (int)(Math.random() * 5 + 1);

            terrain.setCase(x, y, r);
        }

        System.out.println("Les ressources ont été déplacées par la tempête");
    }

    //blocage agents
    public void bloquerAgents(int intensite) {

        for (Agent a : agents) {
            if (Math.random() < 0.3 * intensite) {
                System.out.println("ATTENTION " + a + " est bloqué par la tempête !");
            }
        }
    }
}
