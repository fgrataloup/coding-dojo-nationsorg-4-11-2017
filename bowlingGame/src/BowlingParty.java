import model.Joueur;
import model.Partie;

import java.util.ArrayList;

/**
 * Created by fgrataloup on 04/11/2017.
 */
public class BowlingParty {


    public static void main(String[] args) {
        final Joueur joueur1 = new Joueur("Luis",2,12);
        final Joueur joueur2 = new Joueur("William",12,2);
        final Joueur joueur3 = new Joueur("Anastasia",2,2);
        final Joueur joueur4 = new Joueur("Fabrice",99,99);
        ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
        joueurs.add(joueur1);
        joueurs.add(joueur2);
        joueurs.add(joueur3);
        joueurs.add(joueur4);
        Partie partie = new Partie(joueurs);
        System.out.print(partie.getListJoueur());
        partie.jouer();
        for(Joueur joueur:partie.getJoueurs()){
            System.out.print("score "+ joueur.getNom() + " " + joueur.getScore() +"\n");
        }

    }

}
