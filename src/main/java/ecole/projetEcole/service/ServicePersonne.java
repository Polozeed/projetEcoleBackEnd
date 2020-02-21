package ecole.projetEcole.service;

import ecole.projetEcole.dto.personne.CollaborateurDto;
import ecole.projetEcole.dto.personne.ContactDto;
import ecole.projetEcole.dto.personne.PersonneDto;
import ecole.projetEcole.entity.CollaborateurEntity;
import ecole.projetEcole.entity.ContactEntity;
import ecole.projetEcole.entity.PersonneEntity;
import ecole.projetEcole.mapper.PersonneMapper;
import ecole.projetEcole.repository.CollaborateurRepository;
import ecole.projetEcole.repository.ContactRepository;
import ecole.projetEcole.repository.FormationRepository;
import ecole.projetEcole.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServicePersonne {

    @Autowired
    PersonneRepository personneRepository;
    @Autowired
    CollaborateurRepository collaborateurRepository;
    @Autowired
    ContactRepository contactRepository;
    @Autowired
    FormationRepository formationRepository;

    public List<PersonneDto> listePersonne (){
        List<PersonneDto> personneDtoListReturn = new ArrayList<>();
        List<PersonneEntity> personneEntityList = personneRepository.findAll();
        for (PersonneEntity personneEntity : personneEntityList) {
            personneDtoListReturn.add(PersonneMapper.convertToDto(personneEntity));
        }
        return personneDtoListReturn;
    }

    public PersonneDto addPersonne(PersonneDto personneDto){
        PersonneEntity personneEntity = PersonneMapper.convertToEntity(personneDto);
        personneEntity = personneRepository.save(personneEntity);
        PersonneDto personneDtoReturn = PersonneMapper.convertToDto(personneEntity);
        return personneDtoReturn;
    }

    public ContactDto addContact(ContactDto contactDto){
        ContactEntity contactEntity = PersonneMapper.convertToContactEntity(contactDto);
        contactEntity = personneRepository.save(contactEntity);
        ContactDto contactDtoReturn = PersonneMapper.convertToContactDto(contactEntity);
        return contactDtoReturn;
    }

    public CollaborateurDto addCollaborateur(CollaborateurDto collaborateurDto){
        CollaborateurEntity collaborateurEntity = PersonneMapper.convertToCollaborateurEntity(collaborateurDto);
        collaborateurEntity = personneRepository.save(collaborateurEntity);
        CollaborateurDto collaborateurDtoReturn = PersonneMapper.convertToCollaborateurDto(collaborateurEntity);
        return collaborateurDtoReturn;
    }

    public List<PersonneDto> rechercheParNomPrenom (String nom, String type){
        List<PersonneDto> personneDtoListReturn = new ArrayList<>();
        switch (type){
            case "contact":
                List<ContactEntity> contactEntityList;
                contactEntityList = personneRepository.findContactByPrenomOrNom(nom, nom);
                for (ContactEntity contact : contactEntityList) {
                    personneDtoListReturn.add(PersonneMapper.convertToDto(contact));
                }
            case "collaborateur" :
                List<CollaborateurEntity> collaborateurEntityList;
                collaborateurEntityList = personneRepository.findCollaborateurByPrenomOrNom(nom, nom);
                for (CollaborateurEntity collab : collaborateurEntityList) {
                    personneDtoListReturn.add(PersonneMapper.convertToDto(collab));
                }
        }
        return personneDtoListReturn;
    }

    public List<PersonneDto> rechercheParId (int id, String type){
        List<PersonneDto> personneDtoListReturn = new ArrayList<>();
        switch (type){
            case "contact":
                List<ContactEntity> contactEntityList;
                contactEntityList = personneRepository.findContactByIdPersonne(id);
                for (ContactEntity contact : contactEntityList) {
                    personneDtoListReturn.add(PersonneMapper.convertToDto(contact));
                }
            case "collaborateur" :
                List<CollaborateurEntity> collaborateurEntityList;
                collaborateurEntityList = personneRepository.findCollaborateurByIdPersonne(id);
                for (CollaborateurEntity collab : collaborateurEntityList) {
                    personneDtoListReturn.add(PersonneMapper.convertToDto(collab));
                }
        }
        return personneDtoListReturn;
    }

    public CollaborateurDto modifierCollaborateur(int idCollab, CollaborateurDto collaborateurDto){
        CollaborateurEntity collaborateurEntity;
        collaborateurEntity = PersonneMapper.convertToCollaborateurEntity(collaborateurDto);
        collaborateurEntity.setIdPersonne(idCollab);
        collaborateurRepository.save(collaborateurEntity);
        return PersonneMapper.convertToCollaborateurDto(collaborateurEntity);
    }

    public ContactDto modifierContact(int idContact, ContactDto contactDto){
        ContactEntity contactEntity;
        contactEntity = PersonneMapper.convertToContactEntity(contactDto);
        contactEntity.setIdPersonne(idContact);
        contactRepository.save(contactEntity);
        return PersonneMapper.convertToContactDto(contactEntity);
    }

    public boolean deleteContact(int id){
        contactRepository.deleteById(id);
        return true;
    }

    public boolean deleteCollaborateur(int id){
        collaborateurRepository.deleteById(id);
        return true;
    }

    public List<PersonneDto> rechercheParIntituleFormation(String nom){
        List<PersonneEntity> personneEntityList;
        List<PersonneDto> personneDtoList = new ArrayList<>();
        personneEntityList = personneRepository.findByIntituleFormation(nom);
        while (personneEntityList.remove(null));
        for (PersonneEntity collab : personneEntityList) {
            personneDtoList.add(PersonneMapper.convertToDto(collab));
        }
        return personneDtoList;
    }

    public List<PersonneDto> listCollabChargementParPage(int limit, int offset){
        List<PersonneDto> collabDtoListReturn = new ArrayList<>();
        List<PersonneEntity> collabEntityList =  personneRepository.findAllByPage(limit, offset);
        for (PersonneEntity collab: collabEntityList) {
            collabDtoListReturn.add(PersonneMapper.convertToDto(collab));
        }
        return  collabDtoListReturn;
    }
}
