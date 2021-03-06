package ecole.projetEcole.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "evenement", schema = "projetecole", catalog = "")
@Data
@EqualsAndHashCode
public class EvenementEntity {

    @Id
    @Column(name = "id_event_ecole")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "intitule")
    private String intitule;

    //@Column(name = "id_adresse")
    @OneToOne
    @JoinColumn(name = "id_adresse")
    private AdresseEntity adresse;

    @Column(name = "horaire_debut")
    private Date horaireDebut;

    @Column(name = "horaire_fin")
    private Date horaireFin;

    @Column(name = "description")
    private String description;

    @Column(name = "id_formation")
    private Integer formationEntity;

    @Column(name = "id_ecole")
    private Integer ecoleEntity;

    @Column(name = "type_event")
    private String eventEcole;

    @Column(name = "couleur")
    private String couleur;

    public AdresseEntity getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseEntity adresse) {
        this.adresse = adresse;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getIdEventEcole() {
        return id;
    }

    public void setIdEventEcole(int id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public AdresseEntity getAdresseEntity() {
        return adresse;
    }

    public void setAdresseEntity(AdresseEntity adresseEntity) {
        this.adresse = adresseEntity;
    }

    public Date getHoraireDebut() {
        return horaireDebut;
    }

    public void setHoraireDebut(Date horaireDebut) {
        this.horaireDebut = horaireDebut;
    }

    public Date getHoraireFin() {
        return horaireFin;
    }

    public void setHoraireFin(Date horaireFin) {
        this.horaireFin = horaireFin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFormationEntity() {
        return formationEntity;
    }

    public void setFormationEntity(Integer formationEntity) {
        this.formationEntity = formationEntity;
    }

    public Integer getEcoleEntity() {
        return ecoleEntity;
    }

    public void setEcoleEntity(Integer ecoleEntity) {
        this.ecoleEntity = ecoleEntity;
    }

    public String getEventEcole() {
        return eventEcole;
    }

    public void setEventEcole(String eventEcole) {
        this.eventEcole = eventEcole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvenementEntity that = (EvenementEntity) o;
        return id == that.id &&
                Objects.equals(intitule, that.intitule) &&
                Objects.equals(adresse, that.adresse) &&
                Objects.equals(horaireDebut, that.horaireDebut) &&
                Objects.equals(horaireFin, that.horaireFin) &&
                Objects.equals(description, that.description) &&
                Objects.equals(formationEntity, that.formationEntity) &&
                Objects.equals(ecoleEntity, that.ecoleEntity) &&
                Objects.equals(eventEcole, that.eventEcole) &&
                Objects.equals(couleur, that.couleur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, intitule, adresse, horaireDebut, horaireFin, description, formationEntity, ecoleEntity, eventEcole, couleur);
    }
}
