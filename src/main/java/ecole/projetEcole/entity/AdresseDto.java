package ecole.projetEcole.entity;

import java.io.Serializable;
import java.util.Objects;

public class AdresseDto implements Serializable {


    private String nomRue;
    private int numRue;
    private String nomVille;
    private String codePostal;
    private String departement;
    private String pays;
    private String gps;

    public AdresseDto(){

    }

    public AdresseDto(String nomRue, int numRue, String nomVille, String codePostal, String departement, String pays, String gps) {
        this.nomRue = nomRue;
        this.numRue = numRue;
        this.nomVille = nomVille;
        this.codePostal = codePostal;
        this.departement = departement;
        this.pays = pays;
        this.gps = gps;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "nomRue='" + nomRue + '\'' +
                ", numRue=" + numRue +
                ", nomVille='" + nomVille + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", departement='" + departement + '\'' +
                ", pays='" + pays + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdresseDto that = (AdresseDto) o;
        return numRue == that.numRue &&
                Objects.equals(nomRue, that.nomRue) &&
                Objects.equals(nomVille, that.nomVille) &&
                Objects.equals(codePostal, that.codePostal) &&
                Objects.equals(departement, that.departement) &&
                Objects.equals(pays, that.pays) &&
                Objects.equals(gps, that.gps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomRue, numRue, nomVille, codePostal, departement, pays, gps);
    }
}
