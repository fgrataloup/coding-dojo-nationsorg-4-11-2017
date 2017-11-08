package model;

import enums.FrameModeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fgrataloup on 04/11/2017.
 */
public class Partie {

    private List<Joueur> joueurs = new ArrayList<Joueur>();

    public Partie(List<Joueur> joueurs){
        this.setJoueurs(joueurs);
    }

    private int nombreTour = 10;

    public int getNombreTour() {
        return nombreTour;
    }

    public int incrementNbTour(){
        return nombreTour = nombreTour +1;
    }

    public int decrementNbTour(){
        return nombreTour = nombreTour -1;
    }

    public String getListJoueur(){
        String listNoms = "";
        for(Joueur joueur: getJoueurs()){
            listNoms +=joueur.getNom() +"\n";
        }
        return listNoms;
    }

    public void jouer(){
        int currentTour = 0;
        for(currentTour=0;currentTour<=nombreTour;currentTour++) {
            for (Joueur joueur : getJoueurs()) {

                Frame frame = new Frame(joueur);
                int nbQuilles = frame.jouerFrame();
                int score = 0;
                if(joueur.getIncrementSpareMode()==0 && joueur.getIncrementStrikeMode()==0) {
                    score = calculateScore(frame, nbQuilles);
                }
                else if(joueur.getIncrementSpareMode()>0){
                    score = calculateScore(frame, nbQuilles)*2;
                }
                else if(joueur.getIncrementStrikeMode()>0){
                    score = calculateScore(frame, nbQuilles)*2;
                }

                joueur.decrementSpecialModes();

                if(nbQuilles == 0 && frame.isASpare()){
                    joueur.setIncrementSpareMode(FrameModeEnum.SPARE.getNumber());
                }
                else if(nbQuilles == 0 && frame.isAStrike()){
                    joueur.setIncrementStrikeMode(FrameModeEnum.STRIKE.getNumber());
                }

                joueur.setScore(joueur.getScore()+score);
            }
        }
    }

    private int calculateScore(Frame frame, int nbQuilles) {
        return frame.getTotalNbQuilles()-nbQuilles;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
}
