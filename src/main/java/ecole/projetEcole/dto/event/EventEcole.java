package ecole.projetEcole.dto.event;

import ecole.projetEcole.dto.Adresse;
import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.dto.ecole.Formation;
import ecole.projetEcole.dto.ecole.Promotion;

import java.io.Serializable;

public class EventEcole extends Evenement implements Serializable {


    private EcoleDto ecole;
    private Formation formation;
    private Promotion promotion;

    public EventEcole(String intitule, Adresse lieu, String horaireDebut, String horaireFin, String description, EcoleDto ecole, Formation formation, Promotion promotion) {
        super(intitule, lieu, horaireDebut, horaireFin, description);
        this.ecole = ecole;
        this.formation = formation;
        this.promotion = promotion;
    }

    public EcoleDto getEcole() {
        return ecole;
    }

    public void setEcole(EcoleDto ecole) {
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
