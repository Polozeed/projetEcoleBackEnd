package ecole.projetEcole.service;

import ecole.projetEcole.dto.event.EvenementDto;
import ecole.projetEcole.entity.EvenementEntity;
import ecole.projetEcole.mapper.EvenementMapper;
import ecole.projetEcole.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceEvenement {




    @Autowired
    EvenementRepository evenementRepository;


    public EvenementDto addEvenement(EvenementDto evenementDto){
        EvenementEntity evenementEntity = EvenementMapper.convertToEntity(evenementDto);
        evenementEntity = evenementRepository.save(evenementEntity);
        EvenementDto evenementDtoReturn;
        evenementDtoReturn = EvenementMapper.convertToDto(evenementEntity);

        return evenementDtoReturn;

    }
}
