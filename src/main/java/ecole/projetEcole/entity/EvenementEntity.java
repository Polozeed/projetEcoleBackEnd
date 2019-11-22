package ecole.projetEcole.entity;

import javax.persistence.*;

@Entity
@Table(name = "event_ecole", schema = "Projet_Ecole", catalog = "")
public class EvenementEntity {
    private int idEventEcole;
    private String intitule;
    private int idAdresse;
    private String horaireDebut;
    private String horaireFin;
    private String description;
    private int idFormation;
    private int idEcole;
    private int idPromotion;

    @Id
    @Column(name = "id_event_ecole")
    public int getIdEventEcole() {
        return idEventEcole;
    }

    public void setIdEventEcole(int idEventEcole) {
        this.idEventEcole = idEventEcole;
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
    @Column(name = "id_adresse")
    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }

    @Basic
    @Column(name = "horaire_debut")
    public String getHoraireDebut() {
        return horaireDebut;
    }

    public void setHoraireDebut(String horaireDebut) {
        this.horaireDebut = horaireDebut;
    }

    @Basic
    @Column(name = "horaire_fin")
    public String getHoraireFin() {
        return horaireFin;
    }

    public void setHoraireFin(String horaireFin) {
        this.horaireFin = horaireFin;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "id_formation")
    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    @Basic
    @Column(name = "id_ecole")
    public int getIdEcole() {
        return idEcole;
    }

    public void setIdEcole(int idEcole) {
        this.idEcole = idEcole;
    }

    @Basic
    @Column(name = "id_promotion")
    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EvenementEntity that = (EvenementEntity) o;

        if (idEventEcole != that.idEventEcole) return false;
        if (idAdresse != that.idAdresse) return false;
        if (idFormation != that.idFormation) return false;
        if (idEcole != that.idEcole) return false;
        if (idPromotion != that.idPromotion) return false;
        if (intitule != null ? !intitule.equals(that.intitule) : that.intitule != null) return false;
        if (horaireDebut != null ? !horaireDebut.equals(that.horaireDebut) : that.horaireDebut != null) return false;
        if (horaireFin != null ? !horaireFin.equals(that.horaireFin) : that.horaireFin != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEventEcole;
        result = 31 * result + (intitule != null ? intitule.hashCode() : 0);
        result = 31 * result + idAdresse;
        result = 31 * result + (horaireDebut != null ? horaireDebut.hashCode() : 0);
        result = 31 * result + (horaireFin != null ? horaireFin.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + idFormation;
        result = 31 * result + idEcole;
        result = 31 * result + idPromotion;
        return result;
    }
}
