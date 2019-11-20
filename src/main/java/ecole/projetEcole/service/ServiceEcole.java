package ecole.projetEcole.service;

import ecole.projetEcole.entity.EcoleEntity;
import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.mapper.EcoleMapper;
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
