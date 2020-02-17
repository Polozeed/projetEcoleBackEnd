package ecole.projetEcole.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class AdresseDto implements Serializable {

    private int idAdresse;
    private String nomRue;
    private int numRue;
    private String nomVille;
    private String codePostal;
    private String departement;
    private String pays;
    private String gps;




}
