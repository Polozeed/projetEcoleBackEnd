package ecole.projetEcole.service;

import ecole.projetEcole.dao.AdresseEntity;
import ecole.projetEcole.dao.EcoleEntity;
import ecole.projetEcole.entity.AdresseDto;
import ecole.projetEcole.entity.ecole.EcoleDto;
import ecole.projetEcole.mapper.AdresseMapper;
import ecole.projetEcole.mapper.EcoleMapper;
import ecole.projetEcole.repository.AdresseRepository;
import ecole.projetEcole.repository.EcoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEcole {

    @Autowired
    EcoleRepository ecoleRepository;


    public EcoleDto addecole(EcoleDto ecoleDto){
        EcoleEntity ecoleDao = EcoleMapper.dtoToDao(ecoleDto);
        ecoleDao = ecoleRepository.save(ecoleDao);
        EcoleDto ecoleDtoReturn;
        ecoleDtoReturn = EcoleMapper.daoToDto(ecoleDao);

        return ecoleDtoReturn;

    }




}
