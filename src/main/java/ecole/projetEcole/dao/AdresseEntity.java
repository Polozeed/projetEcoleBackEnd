package ecole.projetEcole.dao;

import javax.persistence.*;


@Entity
@Table(name = "adresse", schema = "Projet_Ecole", catalog = "")
public class AdresseEntity {

    private int idAdresse;
    private String nomRue;
    private int numRue;
    private String nomVille;
    private String codePostal;
    private String departement;
    private String pays;
    private String gps;

    @Id
    @Column(name = "id_adresse")
    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }

    @Basic
    @Column(name = "nom_rue")
    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    @Basic
    @Column(name = "num_rue")
    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    @Basic
    @Column(name = "nom_ville")
    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    @Basic
    @Column(name = "code_postal")
    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Basic
    @Column(name = "departement")
    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Basic
    @Column(name = "pays")
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Basic
    @Column(name = "gps")
    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdresseEntity that = (AdresseEntity) o;

        if (idAdresse != that.idAdresse) return false;
        if (numRue != that.numRue) return false;
        if (nomRue != null ? !nomRue.equals(that.nomRue) : that.nomRue != null) return false;
        if (nomVille != null ? !nomVille.equals(that.nomVille) : that.nomVille != null) return false;
        if (codePostal != null ? !codePostal.equals(that.codePostal) : that.codePostal != null) return false;
        if (departement != null ? !departement.equals(that.departement) : that.departement != null) return false;
        if (pays != null ? !pays.equals(that.pays) : that.pays != null) return false;
        if (gps != null ? !gps.equals(that.gps) : that.gps != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAdresse;
        result = 31 * result + (nomRue != null ? nomRue.hashCode() : 0);
        result = 31 * result + numRue;
        result = 31 * result + (nomVille != null ? nomVille.hashCode() : 0);
        result = 31 * result + (codePostal != null ? codePostal.hashCode() : 0);
        result = 31 * result + (departement != null ? departement.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        result = 31 * result + (gps != null ? gps.hashCode() : 0);
        return result;
    }
}
