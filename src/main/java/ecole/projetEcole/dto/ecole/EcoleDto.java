package ecole.projetEcole.dto.ecole;

import ecole.projetEcole.dto.AdresseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class EcoleDto implements Serializable {

    private int idEcole;
    private String nom;
    private int nbEtudiants;
    private AdresseDto adresse;
    private String specialite;
    //private Set<FormationDto> formations;

}
