package ecole.projetEcole.dto.personne;

import lombok.Data;

import java.io.Serializable;



@Data
public class CollaborateurDto extends PersonneDto implements Serializable {


    private String equipe;


    public CollaborateurDto(){
    }


}
