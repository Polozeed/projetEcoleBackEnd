package ecole.projetEcole.service;

import ecole.projetEcole.dto.personne.CollaborateurDto;
import ecole.projetEcole.dto.personne.ContactDto;
import ecole.projetEcole.dto.personne.PersonneDto;
import ecole.projetEcole.entity.CollaborateurEntity;
import ecole.projetEcole.entity.ContactEntity;
import ecole.projetEcole.entity.PersonneEntity;
import ecole.projetEcole.mapper.PersonneMapper;
import ecole.projetEcole.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicePersonne {


    @Autowired
    PersonneRepository personneRepository;

    //--------------------------// Service Personne //-------------------------------------
    public PersonneDto addPersonne(PersonneDto personneDto){
        PersonneEntity personneEntity = PersonneMapper.convertToEntity(personneDto);
        personneEntity = personneRepository.save(personneEntity);
        PersonneDto personneDtoReturn;
        personneDtoReturn = PersonneMapper.convertToDto(personneEntity);

        return personneDtoReturn;

    }
    //--------------------------// Service Contact //-------------------------------------
    public ContactDto addContact(ContactDto contactDto){
        ContactEntity contactEntity = PersonneMapper.convertToContactEntity(contactDto);
        contactEntity = personneRepository.save(contactEntity);
        ContactDto contactDtoReturn;
        contactDtoReturn = PersonneMapper.convertToContactDto(contactEntity);

        return contactDtoReturn;

    }
    //--------------------------// Service Collaborateur //-------------------------------------
    public CollaborateurDto addCollaborateur(CollaborateurDto collaborateurDto){
        CollaborateurEntity collaborateurEntity = PersonneMapper.convertToCollaborateurEntity(collaborateurDto);
        collaborateurEntity = personneRepository.save(collaborateurEntity);
        CollaborateurDto collaborateurDtoReturn;
        collaborateurDtoReturn = PersonneMapper.convertToCollaborateurDto(collaborateurEntity);

        return collaborateurDtoReturn;

    }


}
