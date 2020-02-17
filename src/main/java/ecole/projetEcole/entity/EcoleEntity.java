package ecole.projetEcole.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ecole", schema = "projetecole", catalog = "")
@Data
public class EcoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ecole")
    private int idEcole;

    @Column(name = "nom")
    @NaturalId(mutable = true)
    private String nom;

    @Column(name = "nb_etudiant")
    private int nbEtudiants;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_adresse")
    private AdresseEntity adresse;

    @Column(name = "specialite")
    private String specialite;

    @ManyToMany(mappedBy = "ecoles")
    private Set<FormationEntity> formations = new HashSet<>();


    public Set<FormationEntity> getFormations() {
        return formations;
    }

    public void setFormations(Set<FormationEntity> formations) {
        this.formations = formations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EcoleEntity that = (EcoleEntity) o;
        return idEcole == that.idEcole &&
                nbEtudiants == that.nbEtudiants &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(adresse, that.adresse) &&
                Objects.equals(specialite, that.specialite) &&
                Objects.equals(formations, that.formations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEcole, nom, nbEtudiants, adresse, specialite, formations);
    }

    public int getIdEcole() {
        return idEcole;
    }

    public void setIdEcole(int idEcole) {
        this.idEcole = idEcole;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbEtudiants() {
        return nbEtudiants;
    }

    public void setNbEtudiants(int nbEtudiants) {
        this.nbEtudiants = nbEtudiants;
    }

    public AdresseEntity getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseEntity adresse) {
        this.adresse = adresse;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
