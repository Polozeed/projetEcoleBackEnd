package ecole.projetEcole.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "adresse", schema = "Projet_Ecole")
@Setter
@Getter
@EqualsAndHashCode
@Data
public class AdresseEntity {

    @Id
    @Column(name = "id_adresse")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdresse;

    @Column(name = "nom_rue")
    private String nomRue;

    @Column(name = "num_rue")
    private int numRue;

    @Column(name = "nom_ville")
    private String nomVille;

    @Column(name = "code_postal")
    private String codePostal;

    @Column(name = "departement")
    private String departement;

    @Column(name = "pays")
    private String pays;

    @Column(name = "gps")
    private String gps;

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
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
}
