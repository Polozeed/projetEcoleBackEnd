package ecole.projetEcole.entity;

import javax.persistence.*;

@Entity
@Table(name = "formation", schema = "Projet_Ecole", catalog = "")
public class FormationEntity {


    private int idFormation;
    private String intitule;
    private int dureeEtude;
    private int idEcole;

    @Id
    @Column(name = "id_formation")
    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    @Basic
    @Column(name = "intitule")
    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Basic
    @Column(name = "duree_etude")
    public int getDureeEtude() {
        return dureeEtude;
    }

    public void setDureeEtude(int dureeEtude) {
        this.dureeEtude = dureeEtude;
    }

    @Basic
    @Column(name = "id_ecole")
    public int getIdEcole() {
        return idEcole;
    }

    public void setIdEcole(int idEcole) {
        this.idEcole = idEcole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormationEntity that = (FormationEntity) o;

        if (idFormation != that.idFormation) return false;
        if (dureeEtude != that.dureeEtude) return false;
        if (idEcole != that.idEcole) return false;
        if (intitule != null ? !intitule.equals(that.intitule) : that.intitule != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFormation;
        result = 31 * result + (intitule != null ? intitule.hashCode() : 0);
        result = 31 * result + dureeEtude;
        result = 31 * result + idEcole;
        return result;
    }
}
