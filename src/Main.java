public class Main{
    public static void main (String []args){
        Terrain terrain= new Terrain (10,10);
        Simulation simulation= new Simulation(terrain);

        simulation.run(10);
    }
}