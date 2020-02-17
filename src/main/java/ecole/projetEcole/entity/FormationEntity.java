package ecole.projetEcole.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "formation", schema = "projetecole", catalog = "")
@Data
public class FormationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idFormation;

    @Column(name = "intitule")
    private String intitule;

    @Column(name = "duree_etude")
    private int dureeEtude;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "formation_ecole",
            joinColumns = @JoinColumn(name = "id_formation"),
            inverseJoinColumns = @JoinColumn(name = "id_ecole"))
    private Set<EcoleEntity> ecoles;


    public void addEcole(EcoleEntity ecoleEntity) {
        ecoles.add(ecoleEntity);
        ecoleEntity.getFormations().add(this);
    }

    public void removeEcole(EcoleEntity ecoleEntity) {
        ecoles.remove(ecoleEntity);
        ecoleEntity.getFormations().remove(this);
    }

    @Override
    public String toString() {
        return "FormationEntity{" +
                "idFormation=" + idFormation +
                ", intitule='" + intitule + '\'' +
                ", dureeEtude=" + dureeEtude +
                ", ecoleEntitySet=" + ecoles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormationEntity that = (FormationEntity) o;
        return idFormation == that.idFormation &&
                dureeEtude == that.dureeEtude &&
                Objects.equals(intitule, that.intitule) &&
                Objects.equals(ecoles, that.ecoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFormation, intitule, dureeEtude, ecoles);
    }
}
