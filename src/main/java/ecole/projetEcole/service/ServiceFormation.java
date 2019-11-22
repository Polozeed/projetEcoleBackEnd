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

@Service
public class ServiceFormation {


    @Autowired
    FormationRepository formationRepository;





    public FormationDto addformation(FormationDto formationDto){
        FormationEntity formationEntity = FormationMapper.convertToEntity(formationDto);
        formationEntity = formationRepository.save(formationEntity);
        FormationDto formationDtoReturn;
        formationDtoReturn = FormationMapper.convertToDto(formationEntity);

        return formationDtoReturn;

    }
    @Autowired
    DiplomeRepository diplomeRepository;

    public DiplomeDto addDiplome(DiplomeDto diplomeDto){
        DiplomeEntity diplomeEntity = FormationMapper.convertToDiplomeEntity(diplomeDto);
        diplomeEntity  = diplomeRepository.save(diplomeEntity);
        DiplomeDto diplomeDtoReturn;
        diplomeDtoReturn = FormationMapper.convertToDiplomeDto(diplomeEntity);

        return diplomeDtoReturn;

    }
}
