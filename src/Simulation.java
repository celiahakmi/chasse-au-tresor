import java.util.ArrayList;

public class Simulation {

    private Terrain terrain;
    private ArrayList<Agent> agents;

    public Simulation(Terrain terrain) {
        this.terrain = terrain;
        this.agents = new ArrayList<>();
        //les agents
        agents.add(new Explorateur(terrain, 1, 1));
        agents.add(new Explorateur(terrain, 2, 2));
        //les ressources sur le terrain
        terrain.setCase(8, 8, new Tresor(100));
        terrain.setCase(2,2, new Algue(5));
        terrain.setCase(5,7, new Algue(2));
    }

    public void step(int tour) {
        System.out.println("\n=== TOUR " +tour +" ===");
        for (Agent a : agents) {
            try{
                a.agir();
            } catch (HorsMerException e){
                System.out.println("ATTENTION : " + e.getMessage());
            }
        }
        ArrayList<Ressource> listeRessources=terrain.lesRessources();
        for (Ressource r: listeRessources){
            if (r instanceof Aquatique){
                ((Aquatique)r).evoluer();
            }
        }  
        terrain.afficher(5);  
    }

    public void run(int nbtours) {
        for (int i = 0; i < nbtours; i++) {
            step(i);
            if (Math.random()<0.2){
                declencherTempete();
            }
        }
        Statistique.getInstance().afficher();
    }

    public void declencherTempete(){
        System.out.println("Une tempête éclate, les courants déplacent les ressources...");
        ArrayList<Ressource> ressources= terrain.lesRessources();
        for (Ressource r: ressources){
            terrain.viderCase(r.getLigne(),r.getColonne());
            int nl=(int)(Math.random()*terrain.nbLignes)+1;
            int nc= (int)(Math.random()*terrain.nbColonnes)+1;
            if (terrain.caseEstVide(nl, nc)){
                terrain.setCase(nl,nc,r);
            }
        }
    }
}
