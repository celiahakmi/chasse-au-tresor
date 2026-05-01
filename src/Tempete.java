/**
 * HAKMI CELIA
 * Classe représentant une tempête dans la simulation.
 * Une tempête peut déplacer des ressources et perturber les agents.
 */
public class Tempete {

    private int intensite;

    public Tempete(int intensite) {
        this.intensite = intensite;
    }

    public int getIntensite() {
        return intensite;
    }

    /**
     * Applique les effets de la tempête sur la simulation.
     */
    public void declencher(Simulation sim) {

        System.out.println("\nUne tempête frappe la mer! Intensité = " + intensite);

        sim.declencherTempete();

    }
}
