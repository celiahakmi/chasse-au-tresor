/**
 * HAKMI CELIA
 * Classe représentant un explorateur expérimenté.
 * Hérite d'Explorateur et possède des capacités de déplacement ou de détection accrues.
 */

public class ExplorateurAvance extends Explorateur{

    public ExplorateurAvance(Terrain t, int l, int c) {
        super(t, l, c);
    }

    public void agir() throws HorsMerException {
        super.agir();
    }

}
