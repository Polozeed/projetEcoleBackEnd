package ecole.projetEcole.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("collaborateur")
public class CollaborateurEntity extends PersonneEntity {


    /***
     Voir Class PersonneEntity dont herite CollaborateurEntity
     */



}
