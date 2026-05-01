public class Tresor extends Ressource {
    
    public Tresor(int valeur){
        super("TRESOR", valeur);
    }

    public Tresor(Tresor t){
        super("TRESOR", t.getQuantite());
    }
}