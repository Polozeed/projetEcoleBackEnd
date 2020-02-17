package ecole.projetEcole.dto.event;

import ecole.projetEcole.dto.AdresseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode

public class EvenementDto implements Serializable {

    private int id;
    private String intitule;
    private AdresseDto adresse;
    private String horaireDebut;
    private String horaireFin;
    private String description;
    private String couleur;
    private Boolean eventEcole;

    public EvenementDto(){

    }



}
