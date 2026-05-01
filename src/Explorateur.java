/**
 * HAKMI CELIA
 * Classe représentant un explorateur sous-marin.
 * Hérite d'Agent et implémente la recherche de trésors.
 */

public class Explorateur extends Agent{
    
    public Explorateur(Terrain terrain, int l, int c){
        super(terrain,l,c);
    }

    public void agir() throws HorsMerException{
        int pasL = (int)(Math.random()*3)-1;
        int pasC = (int)(Math.random()*3)-1;
        int newL = lig+pasL;
        int newC = col+pasC;
        
        if (newL >=0 && newL<10 && newC>=0 && newC<10){
            seDeplacer(newL, newC);
            System.out.println("Explorateur → (" + newL + "," + newC + ")");
        }
        
        Ressource res= terrain.getCase(this.lig, this.col);
        if (res instanceof Tresor){
            System.out.println("LE TRESOR EST TROUVÉ EN (" + this.lig + "," + this.col +")");
            Statistique.getInstance().nbTresors++;
            terrain.viderCase(this.lig,this.col);
        }
    }
}