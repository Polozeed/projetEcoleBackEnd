package ecole.projetEcole.dto;

import lombok.*;

import java.io.Serializable;


@Data
public class AdresseDto implements Serializable {


    private String nomRue;
    private int numRue;
    private String nomVille;
    private String codePostal;
    private String departement;
    private String pays;
    private String gps;

    /*public AdresseDto(String nomRue, int numRue, String nomVille, String codePostal, String departement, String pays, String gps) {
        this.nomRue = nomRue;
        this.numRue = numRue;
        this.nomVille = nomVille;
        this.codePostal = codePostal;
        this.departement = departement;
        this.pays = pays;
        this.gps = gps;
    }*/

}