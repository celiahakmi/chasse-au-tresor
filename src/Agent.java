public abstract class Agent{ Et
    protected Terrain terrain;
    protected int lig;
    protected int col;

    public Agent (Terrain terrain, int lig, int col){
        this.terrain=terrain;
        this.lig=lig;
        this.col=col;
    }

    public double distance(int l, int c){
        int dx= lig-l;
        int dy= col-c;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public void seDeplacer(int l, int c)throws HorsMerException {
        if (l<1 || l>=20 || c<1 || c>=20){
            throw new HorsMerException("L'agent veut sortir de la mer ! ("+l+", "+c+")");
        }
        this.lig=l;
        this.col=c;
        Statistique.getInstance().nbDeplacements++;
    }

    public abstract void agir() throws HorsMerException;
}