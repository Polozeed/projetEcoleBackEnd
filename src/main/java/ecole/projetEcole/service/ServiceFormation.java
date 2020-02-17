package ecole.projetEcole.service;

import ecole.projetEcole.dto.ecole.DiplomeDto;
import ecole.projetEcole.dto.ecole.FormationDto;
import ecole.projetEcole.entity.DiplomeEntity;
import ecole.projetEcole.entity.FormationEntity;
import ecole.projetEcole.mapper.FormationMapper;
import ecole.projetEcole.repository.DiplomeRepository;
import ecole.projetEcole.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceFormation {

    @Autowired
    FormationRepository formationRepository;
    @Autowired
    DiplomeRepository diplomeRepository;

    public FormationDto addformation(FormationDto formationDto){
        FormationEntity formationEntity = FormationMapper.convertToEntity(formationDto);
        formationEntity = formationRepository.save(formationEntity);
        FormationDto formationDtoReturn = FormationMapper.convertToDto(formationEntity);
        return formationDtoReturn;
    }

    public DiplomeDto addDiplome(DiplomeDto diplomeDto){
        DiplomeEntity diplomeEntity = FormationMapper.convertToDiplomeEntity(diplomeDto);
        diplomeEntity  = diplomeRepository.save(diplomeEntity);
        DiplomeDto diplomeDtoReturn = FormationMapper.convertToDiplomeDto(diplomeEntity);
        return diplomeDtoReturn;
    }

    public List<FormationDto> rechercheParIntitule(String nom){
        List<FormationEntity> formationEntityList;
        formationEntityList= formationRepository.findByIntitule(nom);
        FormationDto formationDto;
        List<FormationDto> formationDtoListReturn = new ArrayList<>();
        for (FormationEntity formation: formationEntityList) {
            formationDto = FormationMapper.convertToDto(formation);
            formationDtoListReturn.add(formationDto);
        }
        return  formationDtoListReturn;
    }

    public List<DiplomeDto> rechercheDiplomeParIntitule(String nom){
        List<DiplomeEntity> diplomeEntityList;
        diplomeEntityList= diplomeRepository.findByNomDiplome(nom);
        DiplomeDto diplomeDto;
        List<DiplomeDto> diplomeDtoListReturn = new ArrayList<>();
        for (DiplomeEntity diplomeEntity: diplomeEntityList) {
            diplomeDto = FormationMapper.convertToDiplomeDto(diplomeEntity);
            diplomeDtoListReturn.add(diplomeDto);
        }
        return  diplomeDtoListReturn;
    }

    
}
