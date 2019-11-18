package ecole.projetEcole.dto.event;

import ecole.projetEcole.dto.Adresse;
import ecole.projetEcole.dto.ecole.Ecole;
import ecole.projetEcole.dto.ecole.Formation;
import ecole.projetEcole.dto.ecole.Promotion;

import java.io.Serializable;
import java.util.Date;

public class EventEcole extends Evenement implements Serializable {


    private Ecole ecole;
    private Formation formation;
    private Promotion promotion;

    public EventEcole(String intitule, Adresse lieu, String horaireDebut, String horaireFin, String description, Ecole ecole, Formation formation, Promotion promotion) {
        super(intitule, lieu, horaireDebut, horaireFin, description);
        this.ecole = ecole;
        this.formation = formation;
        this.promotion = promotion;
    }

    public Ecole getEcole() {
        return ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "EventEcole{" +
                "ecole=" + ecole +
                ", formation=" + formation +
                ", promotion=" + promotion +
                '}';
    }
}
