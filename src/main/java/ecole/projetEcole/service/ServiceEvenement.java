package ecole.projetEcole.service;

import ecole.projetEcole.dto.event.EvenementDto;
import ecole.projetEcole.entity.EvenementEntity;
import ecole.projetEcole.mapper.EvenementMapper;
import ecole.projetEcole.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServiceEvenement {

    @Autowired
    EvenementRepository evenementRepository;

    public EvenementDto addEvenement(EvenementDto evenementDto){
        EvenementEntity evenementEntity = EvenementMapper.convertToEntity(evenementDto);
        evenementEntity = evenementRepository.save(evenementEntity);
        EvenementDto evenementDtoReturn = EvenementMapper.convertToDto(evenementEntity);
        return evenementDtoReturn;
    }

    public EvenementDto rechercheParId(int id){
        EvenementEntity evenementEntity = evenementRepository.findById(id).orElse(null);
        EvenementDto evenementDtoReturn = EvenementMapper.convertToDto(evenementEntity);
        return  evenementDtoReturn;
    }
    public List<EvenementDto> rechercheParIntitule(String intitule){
        List<EvenementEntity> evenementEntityList = evenementRepository.findByIntitule(intitule);
        List<EvenementDto> evenementDtoListReturn = new ArrayList<>();
        for (EvenementEntity event:evenementEntityList) {
            evenementDtoListReturn.add(EvenementMapper.convertToDto(event));
        }
        return  evenementDtoListReturn;
    }

    public List<EvenementDto> rechercheParDate(String date){
        List<EvenementEntity> evenementEntityList = evenementRepository.findByHoraireDebutContainsOrHoraireFinContains(date,date);
        List<EvenementDto> evenementDtoListReturn = new ArrayList<>();
        for (EvenementEntity event:evenementEntityList) {
            evenementDtoListReturn.add(EvenementMapper.convertToDto(event));
        }
        return  evenementDtoListReturn;
    }

    public List<EvenementDto> listEvenement(){
        List<EvenementDto> evenementDtoListReturn = new ArrayList<>();
        List<EvenementEntity> evenementEntityList = (List<EvenementEntity>) evenementRepository.findAll();
        for (EvenementEntity event:evenementEntityList) {
            evenementDtoListReturn.add(EvenementMapper.convertToDto(event));
        }
        return  evenementDtoListReturn;
    }

    public List<EvenementDto> listEvenementPourChargementParPage(int limit, int offset){
        List<EvenementDto> evenementDtoListReturn = new ArrayList<>();
        List<EvenementEntity> evenementEntityList =  evenementRepository.findAllByPage(limit, offset);
        for (EvenementEntity event:evenementEntityList) {
            evenementDtoListReturn.add(EvenementMapper.convertToDto(event));
        }
        return  evenementDtoListReturn;
    }


    public EvenementDto modifierEvenement(int id, EvenementDto evenementDto){
        EvenementEntity evenementEntity =  EvenementMapper.convertToEntity(evenementDto);
        evenementEntity.setIdEventEcole(id);
        evenementRepository.save(evenementEntity);
        return EvenementMapper.convertToDto(evenementEntity);
    }


    public void deleteEvenement(int id){
        evenementRepository.deleteById(id);
    }
}
