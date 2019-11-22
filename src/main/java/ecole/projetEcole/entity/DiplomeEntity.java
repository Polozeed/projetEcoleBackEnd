package ecole.projetEcole.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "diplome", schema = "Projet_Ecole", catalog = "")
@Data
@EqualsAndHashCode
public class DiplomeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diplome")
    private int idDiplome;
    @Column(name = "nom_diplome")
    private String nomDiplome;
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "id_formation")
    private int idFormation;



}
