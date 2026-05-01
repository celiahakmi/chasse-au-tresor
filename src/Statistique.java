public class Statistique {
    
    private static Statistique instance=null;
    public static int nbTresors= 0;
    public static int nbDeplacements=0;

    private Statistique(){}

    public static Statistique getIstance(){
        if(instance==null){
            instance=new Statistique();
        }
        return instance;
    }

    public static void afficher(){
        System.out.println("\n--- STATISTIQUES FINALES ---");
        System.out.println("Tresors trouvés: " + nbTresors);
        System.out.println("Deplacements totaux : " + nbDeplacements);
    }
}
