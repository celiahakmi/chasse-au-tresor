public abstract class Agent{
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

    public void seDeplacer(int l, int c){
        this.lig=l;
        this.col=c;
    }

    public abstract void agir();
}