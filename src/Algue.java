/**
 * HAKMI CELIA
 * Classe représentant une ressource de type Algue.
 * Implémente l'interface Aquatique pour marquer son appartenance au milieu marin.
 */

public class Algue extends Ressource implements Aquatique {

    public Algue (int quantite){
        super("ALGUE", quantite);
    }

    public void evoluer(){
        this.setQuantite(this.getQuantite() +1);
    }
}
