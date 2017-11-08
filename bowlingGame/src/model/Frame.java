package model;

/**
 * Created by fgrataloup on 04/11/2017.
 */
public class Frame {
    private int nbBoules = 2;
    private int nbQuilles = 10;
    private int totalNbQuilles = 10;
    private boolean isASpare = false;
    private boolean isAStrike = false;
    private Joueur joueur;

    public Frame(Joueur joueur){
        this.joueur = joueur;
    }

    public int jouerFrame(){
        int currentBoule = 0;
        for(currentBoule = 0;currentBoule<nbBoules;currentBoule++){
            faireTomberQuilles();
            if(currentBoule == 0 && nbQuilles == 0){
                isAStrike = true;
            }
            else if(currentBoule == 1 && nbQuilles == 0){
                isASpare = true;
            }
        }
        return nbQuilles;
    }

    private int faireTomberQuilles(){
        Double rand = Math.random();
        rand = rand*10;
        rand = rand * ((joueur.getForce() + joueur.getPrecision())/10) ;
        Integer integer = rand.intValue();
        nbQuilles = nbQuilles - integer;
        return nbQuilles<0?nbQuilles =0:nbQuilles;
    }

    public boolean isASpare() {
        return isASpare;
    }

    public boolean isAStrike() {
        return isAStrike;
    }

    public int getTotalNbQuilles() {
        return totalNbQuilles;
    }

}
