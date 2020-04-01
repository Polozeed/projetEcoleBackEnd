package ecole.projetEcole.service;

import ecole.projetEcole.dto.AdresseDto;
import ecole.projetEcole.entity.AdresseEntity;
import ecole.projetEcole.mapper.AdresseMapper;
import ecole.projetEcole.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceAdresse {

    @Autowired
    AdresseRepository adresseRepository;

    public AdresseDto addAdresse(AdresseDto adresseDto){
        AdresseEntity adresseDao = AdresseMapper.convertToEntity(adresseDto);
        adresseDao = adresseRepository.save(adresseDao);
        AdresseDto adresseDtoReturn;
        adresseDtoReturn = AdresseMapper.convertToDto(adresseDao);
        return adresseDtoReturn;
    }

    public AdresseDto modifierAdresse(int idAdresse, AdresseDto adresseDto){
        AdresseEntity adresseEntity = AdresseMapper.convertToEntity(adresseDto);
        adresseEntity.setIdAdresse(idAdresse);
        adresseRepository.save(adresseEntity);
        return AdresseMapper.convertToDto(adresseEntity);
    }

    public AdresseDto rechercheParId(int id){
        AdresseEntity adresseEntity = adresseRepository.findById(id).orElse(null);
        AdresseDto adresseDtoReturn = AdresseMapper.convertToDto(adresseEntity);
        return  adresseDtoReturn;
    }
}
