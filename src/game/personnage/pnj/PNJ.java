package game.personnage.pnj;

public class PNJ {
    protected String nom;
    protected int pv;
    public PNJ(String n, int pv){
        this.nom = n;
        this.pv = pv;
    }
    public String getNom() {return nom;}
    public int getPv() {return pv;}

    public void perdsPV(int pv_infliges){this.pv -= pv_infliges;}
    public void gagnePV(int pv_gagnes){this.pv += pv_gagnes;}
    public boolean estMort(){
        return this.pv <= 0;
    }
}
