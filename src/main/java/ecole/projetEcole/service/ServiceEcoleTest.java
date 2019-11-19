package ecole.projetEcole.service;

import ecole.projetEcole.dao.Ecole;
import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.mapper.EcoleMapper;
import ecole.projetEcole.repository.EcoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEcoleTest {

    @Autowired
    EcoleRepository ecoleRepository;

    public EcoleDto addecole(EcoleDto ecoleDto){
        Ecole ecoleDao = EcoleMapper.dtoToDao(ecoleDto);
        ecoleDao = ecoleRepository.save(ecoleDao);
        EcoleDto ecoleDtoReturn;
        ecoleDtoReturn = EcoleMapper.daoToDto(ecoleDao);

        return ecoleDtoReturn;

    }



}
