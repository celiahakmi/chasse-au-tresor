/**
 * HAKMI CELIA
 * Point d'entrée du programme.
 * Initialise le terrain, crée les agents et lance la simulation.
 */

public class Main{
    public static void main (String []args){
        Terrain terrain= new Terrain (10,10);
        Simulation simulation= new Simulation(terrain);

        simulation.run(10);
    }
}