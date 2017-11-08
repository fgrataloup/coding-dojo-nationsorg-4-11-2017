package model;

/**
 * Created by fgrataloup on 04/11/2017.
 */
public class Joueur {

    private String nom = "toto";
    private int precision = 10;
    private int force = 10;
    private int score = 0;
    private int incrementSpareMode = 0;
    private int incrementStrikeMode = 0;


    public Joueur(String nom, int precision, int force){
        this.nom = nom;
        this.precision = precision;
        this.force = force;
    }

    public void decrementSpecialModes(){
        incrementSpareMode = incrementSpareMode -1<0?0:incrementSpareMode -1;
        incrementStrikeMode = incrementStrikeMode - 1<0?0:incrementStrikeMode - 1;

    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getIncrementSpareMode() {
        return incrementSpareMode;
    }

    public void setIncrementSpareMode(int incrementSpareMode) {
        this.incrementSpareMode = incrementSpareMode;
    }

    public int getIncrementStrikeMode() {
        return incrementStrikeMode;
    }

    public void setIncrementStrikeMode(int incrementStrikeMode) {
        this.incrementStrikeMode = incrementStrikeMode;
    }
}
