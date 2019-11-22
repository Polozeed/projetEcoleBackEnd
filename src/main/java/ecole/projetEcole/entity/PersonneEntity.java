package ecole.projetEcole.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "personne", schema = "Projet_Ecole", catalog = "")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSONNE")
@Data
public class PersonneEntity {

    @Id
    @Column(name = "id_collaborateur")
    private int idCollaborateur;
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
    private Date dateNaissance;
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "id_formation")
    private int idFormation;
    @Column(name = "id_ecole")
    private int idEcole;
    @Column(name = "equipe")
    private String equipe;


}
