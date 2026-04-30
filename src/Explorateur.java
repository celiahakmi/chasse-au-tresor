public class Explorateur extends Agent{
    
    public Explorateur(Terrain terrain, int l, int c){
        super(terrain,l,c);
    }

    public void agir(){
        int newl=lig+(int)(Math.random()*3-1);
        int newc=col+(int)(Math.random()*3-1);
        seDeplacer(newl,newc);
        System.out.println("Explorateur se déplace en (" + newl + "," + newc + ")");
    }
}