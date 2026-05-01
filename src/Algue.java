public class Algue extends Ressource implements Aquatique {

    public Algue (int quantite){
        super("ALGUE", quantite);
    }

    public void evoluer(){
        this.setQuantite(this.getQuantite() +1);
    }
}
