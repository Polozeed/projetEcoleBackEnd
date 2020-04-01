package ecole.projetEcole.entity;


import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("contact" )
public class ContactEntity extends PersonneEntity{

    /***
     Voir Class PersonneEntity dont herite ContactEntity
     */
}
