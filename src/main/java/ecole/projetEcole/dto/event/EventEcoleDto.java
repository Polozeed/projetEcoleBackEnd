package ecole.projetEcole.dto.event;

import ecole.projetEcole.dto.AdresseDto;
import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.dto.ecole.FormationDto;
import ecole.projetEcole.dto.ecole.Promotion;

import java.io.Serializable;

public class EventEcoleDto extends EvenementDto implements Serializable {


    private EcoleDto ecole;
    private FormationDto formation;
    private Promotion promotion;

    public EventEcoleDto(String intitule, AdresseDto lieu, String horaireDebut, String horaireFin, String description, EcoleDto ecole, FormationDto formation, Promotion promotion) {
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

    public FormationDto getFormation() {
        return formation;
    }

    public void setFormation(FormationDto formation) {
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
