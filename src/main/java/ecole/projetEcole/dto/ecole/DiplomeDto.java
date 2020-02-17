package ecole.projetEcole.dto.ecole;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DiplomeDto implements Serializable {


    private int idDiplome;
    private String nomDiplome;
    private String commentaire;
    private FormationDto formation;

}
