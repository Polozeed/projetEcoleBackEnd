package ecole.projetEcole.dto.event;

import ecole.projetEcole.dto.AdresseDto;
import lombok.*;

import java.io.Serializable;

@Data
public class EvenementDto implements Serializable {



    private String intitule;
    private AdresseDto lieu;
    private String horaireDebut;
    private String horaireFin;
    private String description;

    public EvenementDto(){

    }

    public EvenementDto(String intitule, AdresseDto lieu, String horaireDebut, String horaireFin, String description) {
        this.intitule = intitule;
        this.lieu = lieu;
        this.horaireDebut = horaireDebut;
        this.horaireFin = horaireFin;
        this.description = description;
    }

}
