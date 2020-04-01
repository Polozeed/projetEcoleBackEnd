package ecole.projetEcole.repository;

import ecole.projetEcole.entity.ContactEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository  extends CrudRepository<ContactEntity, Integer>  {



}
