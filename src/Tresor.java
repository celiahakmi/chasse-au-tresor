/**
 * HAKMI CELIA
 * Classe représentant un trésor à collecter.
 * Contient un constructeur de copie pour la gestion des ressources.
 */

public class Tresor extends Ressource {
    
    public Tresor(int valeur){
        super("TRESOR", valeur);
    }

    public Tresor(Tresor t){
        super("TRESOR", t.getQuantite());
    }
}