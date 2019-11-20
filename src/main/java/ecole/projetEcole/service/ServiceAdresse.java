package ecole.projetEcole.service;

import ecole.projetEcole.entity.AdresseEntity;
import ecole.projetEcole.dto.AdresseDto;
import ecole.projetEcole.mapper.AdresseMapper;
import ecole.projetEcole.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceAdresse {


    @Autowired
    AdresseRepository adresseRepository;


    public AdresseDto addAdresse(AdresseDto adresseDto){
        AdresseEntity adresseDao = AdresseMapper.dtoToDao(adresseDto);
        adresseDao = adresseRepository.save(adresseDao);
        AdresseDto adresseDtoReturn;
        adresseDtoReturn = AdresseMapper.daoToDto(adresseDao);

        return adresseDtoReturn;

    }
}
