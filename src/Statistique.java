/**
 * HAKMI CELIA
 * Singleton gérant les statistiques globales de la simulation.
 * Enregistre le nombre de trésors trouvés et les déplacements effectués.
 */

public class Statistique {
    
    private static Statistique instance=null;
    public int nbTresors= 0;
    public int nbDeplacements=0;

    private Statistique(){}

    public static Statistique getInstance(){
        if(instance==null){
            instance=new Statistique();
        }
        return instance;
    }

    public void afficher(){
        System.out.println("\n--- STATISTIQUES FINALES ---");
        System.out.println("Tresors trouvés: " + this.nbTresors);
        System.out.println("Deplacements totaux : " + this.nbDeplacements);
    }
}
