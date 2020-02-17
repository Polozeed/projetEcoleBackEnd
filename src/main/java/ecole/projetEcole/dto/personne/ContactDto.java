package ecole.projetEcole.dto.personne;

import lombok.Data;

import java.io.Serializable;


@Data
public class ContactDto extends PersonneDto implements Serializable {


    private String commentaire;
    private int idEcole;


    public ContactDto(){
        super();
    }


}
