package ecole.projetEcole.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "personne", schema = "projetecole", catalog = "")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSONNE")
@Data
public class PersonneEntity {

    @Id
    @Column(name = "id_personne")
    private int idPersonne;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "fonction")
    private String fonction;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numero_tel")
    private long numeroTel;

    @Column(name = "date_naissance")
    private String dateNaissance;

    @Column(name = "commentaire")
    private String commentaire;

/*
    @Column(name = "id_formation")
    @OneToMany
    private List<FormationEntity> formationEntity;

 */
    @Column(name = "id_formation")
    private Integer formationEntity;

    @Column(name = "id_ecole")
    private Integer ecoleEntity;

    @Column(name = "equipe")
    private String equipe;

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(long numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
