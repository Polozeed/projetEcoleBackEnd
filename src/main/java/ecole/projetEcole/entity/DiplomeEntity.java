package ecole.projetEcole.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "diplome", schema = "projetecole")
@Data
public class DiplomeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diplome")
    private int idDiplome;

    @Column(name = "nom_diplome")
    private String nomDiplome;

    @Column(name = "commentaire")
    private String commentaire;

    @OneToOne
    @JoinColumn(name = "id_formation")
    private FormationEntity formation;

}
