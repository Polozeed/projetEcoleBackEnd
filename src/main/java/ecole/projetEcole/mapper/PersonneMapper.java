package ecole.projetEcole.mapper;

import ecole.projetEcole.dto.personne.CollaborateurDto;
import ecole.projetEcole.dto.personne.ContactDto;
import ecole.projetEcole.dto.personne.PersonneDto;
import ecole.projetEcole.entity.CollaborateurEntity;
import ecole.projetEcole.entity.ContactEntity;
import ecole.projetEcole.entity.PersonneEntity;
import org.modelmapper.ModelMapper;

public class PersonneMapper {

    public static PersonneDto convertToDto(PersonneEntity personneEntity) {
        ModelMapper modelMapper = new ModelMapper();
        PersonneDto personneDto =  modelMapper.map(personneEntity, PersonneDto.class);
        return personneDto;
    }

    public static PersonneEntity convertToEntity(PersonneDto personnedto) {
        ModelMapper modelMapper = new ModelMapper();
        PersonneEntity personneEntity =  modelMapper.map(personnedto, PersonneEntity.class);
        return personneEntity;
    }


    public static ContactDto convertToContactDto(ContactEntity contactEntity) {
        ModelMapper modelMapper = new ModelMapper();
        ContactDto contactDto =  modelMapper.map(contactEntity, ContactDto.class);
        return contactDto;
    }

    public static ContactEntity convertToContactEntity(ContactDto contactDto) {
        ModelMapper modelMapper = new ModelMapper();
        ContactEntity contactEntity=  modelMapper.map(contactDto, ContactEntity.class);
        return contactEntity;
    }

    public static CollaborateurDto convertToCollaborateurDto(CollaborateurEntity collaborateurEntity) {
        ModelMapper modelMapper = new ModelMapper();
        CollaborateurDto collaborateurDto =  modelMapper.map(collaborateurEntity, CollaborateurDto.class);
        return collaborateurDto;
    }

    public static CollaborateurEntity convertToCollaborateurEntity(CollaborateurDto collaborateurDto) {
        ModelMapper modelMapper = new ModelMapper();
        CollaborateurEntity collaborateurEntity=  modelMapper.map(collaborateurDto, CollaborateurEntity.class);
        return collaborateurEntity;
    }



}
