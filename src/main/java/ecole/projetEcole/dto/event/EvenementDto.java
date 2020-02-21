package ecole.projetEcole.dto.event;

import ecole.projetEcole.dto.AdresseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode

public class EvenementDto implements Serializable {

    private int id;
    private String intitule;
    private AdresseDto adresse;
    private Date horaireDebut;
    private Date horaireFin;
    private String description;
    private String couleur;
    private Boolean eventEcole;

    public EvenementDto(){

    }



}
