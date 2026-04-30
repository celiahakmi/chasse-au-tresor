public class Explorateur extends Agent{
    
    public Explorateur(Terrain terrain, int l, int c){
        super(terrain,l,c);
    }

    public void agir(){
    int targetL = 8;
    int targetC = 8;

    int newL = lig;
    int newC = col;

    if (lig < targetL) newL++;
    else if (lig > targetL) newL--;

    if (col < targetC) newC++;
    else if (col > targetC) newC--;

    seDeplacer(newL, newC);

    System.out.println("Explorateur → (" + newL + "," + newC + ")");

    if (newL == targetL && newC == targetC) {
        System.out.println("TRÉSOR TROUVÉ !");
    }
    }
}